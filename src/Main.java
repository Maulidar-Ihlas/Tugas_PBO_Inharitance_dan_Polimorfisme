public class Main {
    public static void main(String[] args) {
        System.out.println("--- Menguji Instansiasi Langsung ---");

        // Menguji kelas BujurSangkar
        BujurSangkar kotak = new BujurSangkar(5.0, "Merah");
        kotak.printInfo();

        // Menguji kelas Lingkaran
        Lingkaran bulat = new Lingkaran(7.0, "Biru");
        bulat.printInfo();

        // Menguji kelas Silinder
        Silinder tabung = new Silinder(10.0, 7.0, "Kuning");
        tabung.printInfo();


        System.out.println("\n--- Menguji Polimorfisme ---");

        // Menggunakan array dari kelas Induk (Bentuk) untuk menyimpan berbagai objek turunannya
        Bentuk[] daftarBentuk = new Bentuk[3];
        daftarBentuk[0] = new BujurSangkar(4.0, "Hijau");
        daftarBentuk[1] = new Lingkaran(10.0, "Ungu");
        daftarBentuk[2] = new Silinder(5.0, 14.0, "Oranye");

        // Memanggil printInfo() secara dinamis berdasarkan objek aslinya
        for (int i = 0; i < daftarBentuk.length; i++) {
            daftarBentuk[i].printInfo();
        }
    }
}