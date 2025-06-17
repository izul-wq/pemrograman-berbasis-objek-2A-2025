package pembayaran;

public class KartuKredit implements Payment{
    @Override
    public double ProsesPembayaran(double total){
        double biayaTambahan = 0.02;
        return total + (total * biayaTambahan);
    }
}
