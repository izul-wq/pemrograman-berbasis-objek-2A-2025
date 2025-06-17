package booking;

public class Sepeda extends Kendaraan implements Booking {

    public Sepeda() {
        super("Sepeda", 50000);
    }

    @Override
    public double hitungBiaya(int hari, int umur) {
        return tarifPerHari * hari;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Kendaraan: " + nama + ", Tarif: Rp" + tarifPerHari + "/hari (Tanpa Asuransi)");
    }
}
