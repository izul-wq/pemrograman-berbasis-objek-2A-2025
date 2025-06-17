package booking;

public class Motor extends Kendaraan implements Booking, Asuransi {

    public Motor() {
        super("Motor", 100000);
    }

    @Override
    public double hitungBiaya(int hari, int umur) {
        if (umur < 17) {
            throw new IllegalArgumentException("Usia minimal untuk booking motor adalah 17 tahun.");
        }
        return (tarifPerHari * hari) + biayaAsuransi();
    }

    @Override
    public double biayaAsuransi() {
        return 20000;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Kendaraan: " + nama + ", Tarif: Rp" + tarifPerHari + "/hari + Asuransi Rp" + biayaAsuransi());
    }
}
