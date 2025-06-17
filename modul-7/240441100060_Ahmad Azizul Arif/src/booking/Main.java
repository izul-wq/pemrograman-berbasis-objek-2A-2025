package booking;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kendaraan kendaraan = null;
        Booking booking = null;

        System.out.println("Pilih kendaraan:");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("3. Sepeda");
        System.out.print("Pilihan Anda: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                kendaraan = new Mobil();
                booking = (Booking) kendaraan;
                break;
            case 2:
                kendaraan = new Motor();
                booking = (Booking) kendaraan;
                break;
            case 3:
                kendaraan = new Sepeda();
                booking = (Booking) kendaraan;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                System.exit(0);
        }

        kendaraan.tampilInfo();

        System.out.print("Masukkan jumlah hari sewa: ");
        int hari = scanner.nextInt();

        System.out.print("Masukkan usia Anda: ");
        int umur = scanner.nextInt();

        try {
            double total = booking.hitungBiaya(hari, umur);
            System.out.println("Total biaya sewa: Rp" + total);
        } catch (IllegalArgumentException e) {
            System.out.println("Gagal booking: " + e.getMessage());
        }
    }
}
