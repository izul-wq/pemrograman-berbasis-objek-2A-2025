package booking;

public class Mobil extends Kendaraan implements Booking, Asuransi {

    public Mobil() {
        super("Mobil", 300000);
    }

    @Override
    public double hitungBiaya(int hari, int umur) {
        if (umur < 17) {
            throw new IllegalArgumentException("Usia minimal untuk booking mobil adalah 17 tahun.");
        }
        return (tarifPerHari * hari) + biayaAsuransi();
    }

    @Override
    public double biayaAsuransi() {
        return 50000;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Kendaraan: " + nama + ", Tarif: Rp" + tarifPerHari + "/hari + Asuransi Rp" + biayaAsuransi());
    }
}
