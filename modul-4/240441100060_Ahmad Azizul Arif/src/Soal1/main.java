package Soal1;

public class main {
    public static void main(String[]args){
        Bank bank = new Bank();
        
        RekeningBank rek1 = new RekeningBank("1","A",5000);
        RekeningBank rek2 = new RekeningBank("2","B",5000);
        RekeningBank rek3 = new RekeningBank("3","C",5000);
        
        bank.tambahRekening(rek1);
        bank.tambahRekening(rek2);
        bank.tambahRekening(rek3);
        
        System.out.println("=== DATA SEMUA REKENING ===");
        bank.tampilkanSemuaRekening();
        
        bank.setor("1",7000);
        bank.setor("2",3000);
        
        bank.tarik("1",1000);
        bank.tarik("2",15000);
        
        System.out.println("\n=== DATA SEMUA REKENING ===");
        bank.tampilkanSemuaRekening();
    }
}