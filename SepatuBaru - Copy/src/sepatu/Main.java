import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Sepatu> daftarSepatu = new ArrayList<>();

    public static void main(String[] args) {
        int pilihan = 0;
        do {
            System.out.println("========== Pendataan Sepatu ==========");
            System.out.println("1. Tambah Sepatu");
            System.out.println("2. Lihat Daftar Sepatu");
            System.out.println("3. Ubah Sepatu");
            System.out.println("4. Hapus Sepatu");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    tambahSepatu();
                    break;
                case 2:
                    lihatDaftarSepatu();
                    break;
                case 3:
                    ubahSepatu();
                    break;
                case 4:
                    hapusSepatu();
                    break
