package peminjaman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManajemenBuku manajemen = new ManajemenBuku();

        // Tambahkan buku
        manajemen.tambahBuku(new BukuFiksi("Laskar Pelangi", "Andrea Hirata"));
        manajemen.tambahBuku(new BukuReferensi("Ensiklopedia Ilmu Alam", "Tim Ilmuwan"));
        manajemen.tambahBuku(new BukuFiksi("Harry Potter", "J.K. Rowling"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        System.out.println("\nDaftar Buku:");
        manajemen.tampilkanSemua();

        System.out.print("\nPilih nomor buku: ");
        int pilihan = scanner.nextInt() - 1;
        Buku bukuDipilih = manajemen.getBuku(pilihan);

        if (bukuDipilih == null) {
            System.out.println("Buku tidak ditemukan.");
            return;
        }

        if (bukuDipilih instanceof Peminjaman) {
            System.out.print("Ingin pinjam atau reservasi? (1 = Pinjam, 2 = Reservasi): ");
            int aksi = scanner.nextInt();
            scanner.nextLine(); // buang newline

            if (aksi == 1) {
                System.out.print("Berapa hari ingin dipinjam? ");
                int hari = scanner.nextInt();
                ((Peminjaman) bukuDipilih).pinjam(nama, hari);
            } else if (aksi == 2) {
                ((Reservasi) bukuDipilih).reservasi(nama);
            } else {
                System.out.println("Pilihan tidak valid.");
            }

        } else if (bukuDipilih instanceof Reservasi) {
            System.out.println("Buku ini hanya bisa direservasi.");
            ((Reservasi) bukuDipilih).reservasi(nama);
        } else {
            System.out.println("Buku ini tidak dapat dipinjam atau direservasi.");
        }
    }
}
