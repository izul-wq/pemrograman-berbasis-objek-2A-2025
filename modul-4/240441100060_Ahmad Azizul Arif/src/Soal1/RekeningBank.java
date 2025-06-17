package Soal1;

public class RekeningBank{
    private String noRekening;
    private String namaPemilik;
    private double saldo;
    
    public RekeningBank(String noRekening, String namaPemilik, double saldo){
        this.noRekening = noRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }
    
    public String getnoRekening(){
        return noRekening;
    }
    
    public String getnamaPemilik(){
        return namaPemilik;
    }
    
    public double getsaldo(){
        return saldo;
    }
    
    public void setor(double jumlah){
        if (jumlah > 0){
            saldo += jumlah;
            System.out.println(noRekening + " Berhasil setor : RP" + jumlah);
        } else {
            System.out.println(noRekening + " Jumlah setor tidak valid");
        }
    }
    
    public void tarik(double jumlah){
        if (jumlah > 0 && saldo >= jumlah){
            saldo -= jumlah;
            System.out.println(noRekening + " Berhasil tarik : Rp" + jumlah);
        } else if (jumlah > saldo){
            System.out.println(noRekening + " Saldo tidak cukup untuk penarikan");
        } else {
            System.out.println(noRekening + " Jumlah penarikan tidak valid");
        }
    }
    
    public void tampilkanInfo(){
        System.out.println("No Rekening : " + noRekening);
        System.out.println("Nama \t: " + namaPemilik);
        System.out.println("Saldo \t: " + saldo);
        System.out.println("----------------------------\n");
    }
}