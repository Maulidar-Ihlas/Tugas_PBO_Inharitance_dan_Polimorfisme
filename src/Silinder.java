public class Silinder extends Lingkaran{
    private double Tinggi;

    public Silinder(double Tinggi, double Radius, String Warna) {
        super(Radius, Warna);
        this.Tinggi = Tinggi;
    }

    double getTinggi() {
        return Tinggi;
    }

    public void setTinggi(double t) {
        Tinggi = t;
    }

    public double hitungVolume() {
        return hitungLuas() * Tinggi;
    }

    @Override
    public void printInfo() {
        System.out.println("Silinder warna " + Warna + "Volume = " + hitungVolume());
    }
}
