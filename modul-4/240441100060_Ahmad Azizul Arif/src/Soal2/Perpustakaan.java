package Soal2;
import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList <Buku> daftarBuku;
    
    public Perpustakaan(){
        this.daftarBuku = new ArrayList<>();
    }
    
    public void tambahBuku(String judul, String penulis, int jumlahHalaman){
        Buku bukuBaru = new Buku(judul, penulis, jumlahHalaman);
        daftarBuku.add(bukuBaru);
    }
    public void tampilkanBuku(){
        System.out.println("=== Daftar Buku ===");
        int nomor = 1;
        for (Buku b : daftarBuku){
            System.out.println("Buku ke-" + nomor);
            System.out.println("Judul \t: " + b.getJudul());
            System.out.println("Penulis \t: " + b.getPenulis());
            System.out.println("Jumlah Halaman : " + b.getJumlahHalaman());
            System.out.println("--------------------------------");
            nomor++;
        }
    }
}
