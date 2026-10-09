public class BujurSangkar extends Bentuk {
    private double Sisi;

    // Constructor
    public BujurSangkar(double Sisi, String Warna) {
        super(Warna);
        this.Sisi = Sisi;
    }

    // Accessor
    public double getSisi() {
        return Sisi;
    }

    // Mutator
    public void setSisi(double Sisi) {
        this.Sisi = Sisi;
    }

    public double hitungLuas() {
        return Math.pow(Sisi, 2);
    }

    @Override
    public void printInfo() {
        System.out.println("Bujursangkar berwarna " + Warna + ", luas = "+ hitungLuas());
    }
}
