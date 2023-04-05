
package sepatu;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Sepatu> daftarSepatu = new ArrayList<>();

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("========== Daftar Sepatu ==========");
            System.out.println("1. Tambah Sepatu");
            System.out.println("2. Lihat Sepatu");
            System.out.println("3. Ubah Sepatu");
            System.out.println("4. Hapus Sepatu");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tambahSepatu();
                    break;
                case 2:
                    lihatSepatu();
                    break;
                case 3:
                    ubahSepatu();
                    break;
                case 4:
                    hapusSepatu();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 5);
    }

    private static void tambahSepatu() {
        System.out.println("========== Tambah Sepatu ==========");
        System.out.println("1. Sepatu Lari");
        System.out.println("2. Sepatu Basket");
        System.out.print("Pilihan: ");
        int pilihan = scanner.nextInt();

        String merk;
        int ukuran;
        switch (pilihan) {
            case 1:
                System.out.print("Merk: ");
                merk = scanner.next();
                System.out.print("Ukuran: ");
                ukuran = scanner.nextInt();
                System.out.print("Jenis: ");
                String jenis = scanner.next();
                SepatuLari sepatuLari = new SepatuLari(merk, ukuran, jenis);
                daftarSepatu.add(sepatuLari);
                System.out.println("Sepatu Lari berhasil ditambahkan.");
                break;
                case 2:
                System.out.print("Merk: ");
                merk = scanner.next();
                System.out.print("Ukuran: ");
                ukuran = scanner.nextInt();
                System.out.print("Tipe: ");
                String tipe = scanner.next();
                SepatuBasket sepatuBasket = new SepatuBasket(merk, ukuran, tipe);
                daftarSepatu.add(sepatuBasket);
                System.out.println("Sepatu Basket berhasil ditambahkan.");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }
    }

    private static void lihatSepatu() {
        System.out.println("========== Lihat Sepatu ==========");
        if (daftarSepatu.isEmpty()) {
            System.out.println("Belum ada sepatu yang ditambahkan.");
        } else {
            for (int i = 0; i < daftarSepatu.size(); i++) {
                System.out.println((i + 1) + ". " + daftarSepatu.get(i).getClass().getSimpleName());
                daftarSepatu.get(i).displayInfo();
            }
        }
    }

private static void ubahSepatu() {
    System.out.println("========== Ubah Sepatu ==========");
    if (daftarSepatu.isEmpty()) {
        System.out.println("Belum ada sepatu yang ditambahkan.");
    } else {
        System.out.print("Pilih nomor sepatu yang akan diubah: ");
        int nomor = scanner.nextInt();
        if (nomor < 1 || nomor > daftarSepatu.size()) {
            System.out.println("Nomor sepatu tidak valid!");
        } else {
            Sepatu sepatu = daftarSepatu.get(nomor - 1);
            sepatu.displayInfo();
            System.out.println("Atribut apa yang ingin diubah?");
            System.out.println("1. Merk");
            System.out.println("2. Ukuran");
            if (sepatu instanceof SepatuLari) {
                System.out.println("3. Jenis");
            } else if (sepatu instanceof SepatuBasket) {
                System.out.println("3. Tipe");
            }
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Merk baru: ");
                    String merkBaru = scanner.next();
                    sepatu.setMerk(merkBaru);
                    System.out.println("Merk berhasil diubah.");
                    break;
                case 2:
                    System.out.print("Ukuran baru: ");
                    int ukuranBaru = scanner.nextInt();
                    sepatu.setUkuran(ukuranBaru);
                    System.out.println("Ukuran berhasil diubah.");
                    break;
                case 3:
                    if (sepatu instanceof SepatuLari) {
                        System.out.print("Jenis baru: ");
                        String jenisBaru = scanner.next();
                        ((SepatuLari) sepatu).setJenis(jenisBaru);
                        System.out.println("Jenis berhasil diubah.");
                    } else if (sepatu instanceof SepatuBasket) {
                        System.out.print("Tipe baru: ");
                        String tipeBaru = scanner.next();
                        ((SepatuBasket) sepatu).setTipe(tipeBaru);
                        System.out.println("Tipe berhasil diubah.");
                    } else {
                        System.out.println("Pilihan tidak valid!");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }
}


private static void hapusSepatu() {
    System.out.println("========== Hapus Sepatu ==========");
    if (daftarSepatu.isEmpty()) {
        System.out.println("Belum ada sepatu yang ditambahkan.");
    } else {
        System.out.print("Pilih nomor sepatu yang akan dihapus: ");
        int nomor = scanner.nextInt();
        if (nomor < 1 || nomor > daftarSepatu.size()) {
            System.out.println("Nomor sepatu tidak valid!");
        } else {
            Sepatu sepatu = daftarSepatu.remove(nomor - 1);
            System.out.println("Berhasil menghapus sepatu:");
            sepatu.displayInfo();
        }
    }
    }
}