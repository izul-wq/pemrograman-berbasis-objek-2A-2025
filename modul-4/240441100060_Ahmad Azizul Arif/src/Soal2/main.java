package Soal2;

public class main {
    public static void main(String[]args){
        Perpustakaan perpustakaan = new Perpustakaan();
        
        perpustakaan.tambahBuku("ABC", "Agus", 2);
        perpustakaan.tambahBuku("XYZ", "Asep", 5);
        perpustakaan.tambahBuku("FGH", "Riski", 7);
        
        perpustakaan.tampilkanBuku();
    }
}
