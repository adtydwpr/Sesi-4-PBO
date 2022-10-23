public class Pengajar extends Pelajar{
    String nama;

    Pengajar(String nama){
        super(nama);
        this.nama = nama;
    }

    void info(){
        System.out.println("Nama Pengajar \t\t : " + this.nama);
    }
}
