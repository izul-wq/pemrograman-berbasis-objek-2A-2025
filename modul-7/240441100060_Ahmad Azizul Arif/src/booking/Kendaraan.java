package booking;

public abstract class Kendaraan {
    protected String nama;
    protected double tarifPerHari;

    public Kendaraan(String nama, double tarifPerHari) {
        this.nama = nama;
        this.tarifPerHari = tarifPerHari;
    }

    public String getNama() {
        return nama;
    }

    public abstract void tampilInfo();
}
