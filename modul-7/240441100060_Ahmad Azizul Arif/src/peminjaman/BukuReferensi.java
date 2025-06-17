package peminjaman;

public class BukuReferensi extends Buku implements Reservasi {

    public BukuReferensi(String judul, String penulis) {
        super(judul, penulis);
    }

    @Override
    public void reservasi(String namaPeminjam) {
        System.out.println(namaPeminjam + " telah mereservasi buku referensi '" + judul + "'.");
    }

    @Override
    public void tampilInfo() {
        System.out.println("[Referensi] Judul: " + judul + " | Penulis: " + penulis + " (Tidak untuk dipinjam)");
    }
}
