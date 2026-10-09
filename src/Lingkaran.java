public class Lingkaran extends Bentuk {
    private double Radius;

    public Lingkaran(double Radius, String Warna) {
        super(Warna);
        this.Radius = Radius;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double r) {
        this.Radius = r;
    }

    public double hitungLuas() {
        return Math.PI * Math.pow(Radius, 2);
    }

    @Override
    public void printInfo() {
        System.out.println("Lingkaran berwarna " + Warna + "luas = " +  hitungLuas());
    }
}
