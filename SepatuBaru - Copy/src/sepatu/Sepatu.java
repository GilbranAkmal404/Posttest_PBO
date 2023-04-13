import java.util.ArrayList;
import java.util.Scanner;

interface SepatuInterface {
    void displayInfo();
    void updateHarga(double hargaBaru);
}

class Sepatu {
    String merk;
    int ukuran;
    double harga;

    public Sepatu(String merk, int ukuran, double harga) {
        this.merk = merk;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    public void displayInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp " + harga);
    }

    public void updateHarga(double hargaBaru) {
        harga = hargaBaru;
        System.out.println("Harga sepatu berhasil diupdate menjadi Rp " + harga);
    }
}

class SepatuLari extends Sepatu implements SepatuInterface {
    String jenis;

    public SepatuLari(String merk, int ukuran, double harga, String jenis) {
        super(merk, ukuran, harga);
        this.jenis = jenis;
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Sepatu Lari ===");
        super.displayInfo();
        System.out.println("Jenis: " + jenis);
    }

    @Override
    public void updateHarga(double hargaBaru) {
        super.updateHarga(hargaBaru);
        System.out.println("Harga sepatu lari berhasil diupdate menjadi Rp " + harga);
    }
}

class SepatuBasket extends Sepatu implements SepatuInterface {
    String tipe;

    public SepatuBasket(String merk, int ukuran, double harga, String tipe) {
        super(merk, ukuran, harga);
        this.tipe = tipe;
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Sepatu Basket ===");
        super.displayInfo();
        System.out.println("Tipe: " + tipe);
    }

    @Override
    public void updateHarga(double hargaBaru) {
        super.updateHarga(hargaBaru);
        System.out.println("Harga sepatu basket berhasil diupdate menjadi Rp " + harga);
    }
}

class SepatuShop {
    private static ArrayList<Sepatu> daftarSepatu = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("========== Sepatu Shop ==========");
            System.out.println("1. Tambah Sepatu Lari");
            System.out.println("2. Tambah Sepatu Basket");
            System.out.println("3. Lihat Sepatu");
            System.out.println("4. Ubah Harga Sepatu");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Merk: ");
                    String merkLari = scanner.next();
                    System.out.print("Ukuran: ");
                    int ukuranLari = scanner.nextInt();
                    System.out.print("Harga: ");
                    double hargaLari = scanner.nextDouble();
                    System.out.print("Jenis: ");
                    String jenisLari = scanner.next();
                    SepatuLari sepatuLari = new SepatuLari(merkLari, ukuranLari, hargaLari, jenisLari);
                    daftarSepatu.add(sepatuLari);
                    