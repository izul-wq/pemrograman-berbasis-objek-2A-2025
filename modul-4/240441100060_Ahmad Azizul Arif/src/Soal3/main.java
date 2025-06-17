package Soal3;

public class main {
    public static void main(String[]args){
        Klinik klinik = new Klinik();
        
        klinik.tambahPasien("Asep", 12, "Batuk");
        klinik.tambahPasien("Yanto", 21, "Liver");
        klinik.tambahPasien("Agus", 35, "Stroke");
        
        klinik.tampilkanPasien();
    }
}
