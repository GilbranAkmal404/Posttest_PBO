/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sepatu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TUF-GK
 */
public class Main {
    static ArrayList<Sepatu> listSepatu = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("Pilih menu:");
            System.out.println("1. Tambah sepatu sneakers");
            System.out.println("2. Tambah sepatu boots");
            System.out.println("3. Lihat daftar sepatu");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            
            switch (pilihan) {
                case 1:
                    tambahSneakers();
                    break;
                case 2:
                    tambahBoots();
                    break;
                case 3:
                    lihatDaftarSepatu();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
            
            System.out.println();
        } while (pilihan != 4);
    }
    
    public static void tambahSneakers() {
        System.out.print("Masukkan merek: ");
    String merek = sc.next();
    System.out.print("Masukkan ukuran: ");
    int ukuran = sc.nextInt();
    System.out.print("Masukkan warna: ");
    String warna = sc.next();
    System.out.print("Masukkan jenis sol: ");
    String jenisSol = sc.next();
    
    Sneakers sneakers = new Sneakers(merek, ukuran, warna, jenisSol);
    listSepatu.add(sneakers);
    
    System.out.println("Sepatu sneakers berhasil ditambahkan.");
}

public static void tambahBoots() {
    System.out.print("Masukkan merek: ");
    String merek = sc.next();
    System.out.print("Masukkan ukuran: ");
    int ukuran = sc.nextInt();
    System.out.print("Masukkan warna: ");
    String warna = sc.next();
    System.out.print("Masukkan bahan: ");
    String bahan = sc.next();
    
    Boots boots = new Boots(merek, ukuran, warna, bahan);
    listSepatu.add(boots);
    
    System.out.println("Sepatu boots berhasil ditambahkan.");
}

public static void lihatDaftarSepatu() {
    System.out.println("Daftar sepatu:");
    for (Sepatu sepatu : listSepatu) {
        sepatu.info();
        System.out.println();
    }
}
}
