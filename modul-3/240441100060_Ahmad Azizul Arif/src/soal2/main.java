package soal2;
import java.util.ArrayList;
class Buku{
    String judul;
    String penulis;
    
    public Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }
    
    public void info(){
        System.out.println("Judul Buku      : " + judul);
        System.out.println("Penulis Buku    : " + penulis);
    }
}
class BukuFiksi extends Buku{
    String genre;
    
    public BukuFiksi(String judul, String penulis, String genre){
        super(judul, penulis);
        this.genre = genre;
    }
    
    public void infoFiksi(){
        info();
        System.out.println("Genre Buku      : " + genre);
        System.out.println("");
    }
}
class BukuNonFiksi extends Buku{
    String topik;
    
    public BukuNonFiksi(String judul, String penulis, String topik){
        super(judul, penulis);
        this.topik = topik;
    }
    
    public void infoNonFiksi(){
        info();
        System.out.println("Topik Buku      : " + topik);
        System.out.println("");
    }
}
class Perpustakaan{
    ArrayList<BukuFiksi> koleksiFiksi = new ArrayList<>(); 
    ArrayList<BukuNonFiksi> koleksiNonFiksi = new ArrayList<>(); 
    
    public void tambahBukuFiksi(BukuFiksi BukuBaru){
        koleksiFiksi.add(BukuBaru);
    }
    
    public void tambahBukuNonFiksi(BukuNonFiksi BukuBaru){
        koleksiNonFiksi.add(BukuBaru);
    }
    
    public void tampilkanKoleksi(){
        System.out.println("==== Koleksi Buku Fiksi ====");
            for (BukuFiksi Buku : koleksiFiksi){
                Buku.infoFiksi();
            }
        System.out.println("------------------------------\n");
        System.out.println("==== Koleksi Buku Non Fiksi ====");
            for (BukuNonFiksi Buku : koleksiNonFiksi){
                Buku.infoNonFiksi();
            }
    }
}
public class main {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();
        
        perpus.tambahBukuFiksi(new BukuFiksi("Laskar Pelangi","Andrea Hirata","Drama"));
        perpus.tambahBukuFiksi(new BukuFiksi("One Piece","Eiichiro Oda","Petualangan"));
        
        perpus.tambahBukuNonFiksi(new BukuNonFiksi("Atomic Habits","James Clear","Pengembangan Diri"));
        perpus.tambahBukuNonFiksi(new BukuNonFiksi("Sapiens","Yuval Noah Harari","Sejarah"));
        
        perpus.tampilkanKoleksi();
    }
    
}
