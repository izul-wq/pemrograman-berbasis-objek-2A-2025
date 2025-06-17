package Soal3;
import java.util.ArrayList;

public class Klinik {
    private ArrayList <Pasien> daftarPasien;
    
    public Klinik(){
        this.daftarPasien = new ArrayList<>();
    }
    
    public void tambahPasien(String nama, int umur, String keluhan){
        Pasien pasienBaru = new Pasien(nama, umur, keluhan);
        daftarPasien.add(pasienBaru);
    }
    
    public void tampilkanPasien(){
        System.out.println("=== Daftar Pasien ===");
        int nomor = 1;
        for (Pasien p : daftarPasien){
            System.out.println("Pasien Ke-" + nomor);
            System.out.println("Nama \t: " + p.getNama());
            System.out.println("Umur \t: " + p.getUmur());
            System.out.println("Keluhan \t: " + p.getKeluhan());
            System.out.println("--------------------");
            nomor++;
        }
    }
}
