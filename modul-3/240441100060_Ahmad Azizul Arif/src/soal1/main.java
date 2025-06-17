package soal1;
class Mahasiswa{
    String nama;
    String nim;
    
    public Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }
    
    public void infoMahasiswa(){
        System.out.println("Nama    : " + nama);
        System.out.println("Nim     : " + nim);
    }
}
class MahasiswaReguler extends Mahasiswa{
    String kelas;
    
    public MahasiswaReguler(String nama, String nim, String kelas){
        super(nama, nim);
        this.kelas = kelas;
    }
    
    public void infoReguler(){
        infoMahasiswa();
        System.out.println("Kelas   : " + kelas);
        System.out.println("\n------------------------\n");
    }
}
class MahasiswaBeasiswa extends Mahasiswa{
    String jenisBeasiswa;
    
    public MahasiswaBeasiswa(String nama, String nim, String jenisBeasiswa){
        super(nama,nim);
        this.jenisBeasiswa = jenisBeasiswa;
    }
    
    public void infoBeasiswa(){
        infoMahasiswa();
        System.out.println("Beasiswa : " + jenisBeasiswa);
        System.out.println("\n------------------------\n");
    }
}
public class main {
    public static void main(String[] args) {
        MahasiswaReguler mhsr1 = new MahasiswaReguler("Budi","24044001","SI-2A");
        MahasiswaReguler mhsr2 = new MahasiswaReguler("Siti","24044002","SI-2B");
        
        MahasiswaBeasiswa mhsb1 = new MahasiswaBeasiswa("Yanto","24044003","KIP-K");
        MahasiswaBeasiswa mhsb2 = new MahasiswaBeasiswa("Dewi","24044004","Prestasi");
        
        mhsr1.infoReguler();
        mhsr2.infoReguler();
        
        mhsb1.infoBeasiswa();
        mhsb2.infoBeasiswa();
    }
}