package pembayaran;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Payment metodePembayaran = null;
        
        System.out.print("Masukkan total belanja: Rp ");
        double total = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("Pilih metode pembayaran");
        System.out.println("1. Tunai");
        System.out.println("2. Kartu kredit");
        System.out.println("3. E-Wallet");
        System.out.print("Pilihan Anda: ");
        int pilihan = scanner.nextInt();
        
        switch (pilihan){
            case 1:
                metodePembayaran = new Tunai();
                break;
            case 2:
                metodePembayaran = new KartuKredit();
                break;
            case 3:
                metodePembayaran = new EWallet();
                break;
            default:
                System.out.println("Metode pembayaran tidak valid.");
                System.exit(0);
        }
        
        double totalBayar = metodePembayaran.ProsesPembayaran(total);
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);
    }    
}
