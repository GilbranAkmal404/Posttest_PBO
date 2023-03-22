/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sepatu;

/**
 *
 * @author TUF-GK
 */
import java.util.ArrayList;
import java.util.Scanner;

class Sepatu {
    private String merek;
    private int ukuran;
    private String warna;
    
    public Sepatu(String merek, int ukuran, String warna) {
        this.merek = merek;
        this.ukuran = ukuran;
        this.warna = warna;
    }
    
    public String getMerek() {
        return merek;
    }
    
    public void setMerek(String merek) {
        this.merek = merek;
    }
    
    public int getUkuran() {
        return ukuran;
    }
    
    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }
    
    public String getWarna() {
        return warna;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public void info() {
        System.out.println("Merek: " + merek);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Warna: " + warna);
    }
}

class Sneakers extends Sepatu {
    private String jenisSol;
    
    public Sneakers(String merek, int ukuran, String warna, String jenisSol) {
        super(merek, ukuran, warna);
        this.jenisSol = jenisSol;
    }
    
    public String getJenisSol() {
        return jenisSol;
    }
    
    public void setJenisSol(String jenisSol) {
        this.jenisSol = jenisSol;
    }
    
    public void info() {
        super.info();
        System.out.println("Jenis sol: " + jenisSol);
    }
}

class Boots extends Sepatu {
    private String bahan;
    
    public Boots(String merek, int ukuran, String warna, String bahan) {
        super(merek, ukuran, warna);
        this.bahan = bahan;
    }
    
    public String getBahan() {
        return bahan;
    }
    
    public void setBahan(String bahan) {
        this.bahan = bahan;
    }
    
    public void info() {
        super.info();
        System.out.println("Bahan: " + bahan);
    }
}



