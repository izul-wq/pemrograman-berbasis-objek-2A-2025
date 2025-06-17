package pembayaran;

public class EWallet implements Payment{
    @Override
    public double ProsesPembayaran(double total){
        if (total > 100000){
            double diskon = 0.10;
            return total - (total * diskon);
        }
        return total;
    }
}
