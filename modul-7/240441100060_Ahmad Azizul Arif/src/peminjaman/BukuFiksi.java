package peminjaman;

public class BukuFiksi extends Buku implements Peminjaman, Reservasi {

    public BukuFiksi(String judul, String penulis) {
        super(judul, penulis);
    }

    @Override
    public void pinjam(String namaPeminjam, int hari) {
        if (hari > 7) {
            System.out.println("Maksimal peminjaman buku fiksi adalah 7 hari.");
        } else {
            System.out.println(namaPeminjam + " meminjam buku fiksi '" + judul + "' selama " + hari + " hari.");
        }
    }

    @Override
    public void reservasi(String namaPeminjam) {
        System.out.println(namaPeminjam + " telah mereservasi buku fiksi '" + judul + "'.");
    }

    @Override
    public void tampilInfo() {
        System.out.println("[Fiksi] Judul: " + judul + " | Penulis: " + penulis);
    }
}
