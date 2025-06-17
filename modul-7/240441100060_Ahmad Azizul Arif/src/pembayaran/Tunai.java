package pembayaran;

public class Tunai implements Payment {
    @Override
    public double ProsesPembayaran(double total){
        if (total > 50000){
        double potongan = 20000;   
        return total - potongan;
        }
        return total;
    }
}
