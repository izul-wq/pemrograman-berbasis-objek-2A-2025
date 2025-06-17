package peminjaman;
import java.util.ArrayList;
import java.util.List;

public class ManajemenBuku {
    private List<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanSemua() {
        for (int i = 0; i < daftarBuku.size(); i++) {
            System.out.print((i + 1) + ". ");
            daftarBuku.get(i).tampilInfo();
        }
    }

    public Buku getBuku(int indeks) {
        if (indeks < 0 || indeks >= daftarBuku.size()) {
            return null;
        }
        return daftarBuku.get(indeks);
    }
}
