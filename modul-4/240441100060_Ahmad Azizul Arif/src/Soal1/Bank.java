package Soal1;
import java.util.ArrayList;

public class Bank {
    private ArrayList <RekeningBank> daftarRekening;
    
    public Bank(){
        this.daftarRekening = new ArrayList<>();
    }
    
    public void tambahRekening(RekeningBank rekening){
        daftarRekening.add(rekening);
    }
    
    public RekeningBank cariRekening(String noRekening){
        for (RekeningBank rek : daftarRekening){
            if (rek.getnoRekening().equals(noRekening)){
                return rek;
            }
        }
        return null;
    }
    public void setor(String noRekening, double jumlah){
        RekeningBank rek = cariRekening(noRekening);
        if (rek != null){
            rek.setor(jumlah);
        } else {
            System.out.println("Rekening tidak ditemukan");
        }
    }
    public void tarik(String noRekening, double jumlah) {
    RekeningBank rek = cariRekening(noRekening);
    if (rek != null) {
        rek.tarik(jumlah);
    } else {
        System.out.println("Rekening tidak ditemukan");
    }
}
    public void tampilkanSemuaRekening(){
        for (RekeningBank rek : daftarRekening){
            rek.tampilkanInfo();
        }
    }
}
