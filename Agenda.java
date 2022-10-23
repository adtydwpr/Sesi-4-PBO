import java.sql.Time;

public class Agenda {

    public static void main(String[] args) {
        //Overriding

        Pelajar mhs = new Pelajar("Aditya Dwpr");
        mhs.info();

        mhs = new Pengajar("Alun Sujjada M.Kom");
        mhs.info();

        mhs = new Mapel("Pemrograman berorientasi Objek");
        mhs.info();

        waktu(100);
        waktu("02 September 2022");
        waktu("Senin",8, "Pagi");
    }

    //Overloading
    static void waktu(int Wkt){
        System.out.println("Waktu Kuliah/M \t : " + Wkt);
    }

    static void waktu(String Wkt){
        System.out.println("Pada Tanggal \t : " + Wkt);
    }

    static void waktu(String hari, int Wkt, String waktu){
        System.out.println("Waktu \t\t\t : " + hari + ", Pukul " + Wkt + " " + waktu);
    }


}
