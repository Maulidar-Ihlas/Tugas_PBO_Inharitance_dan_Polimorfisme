public class Bentuk {
    public String Warna;

    // Constructor
    public Bentuk(String Warna) {
        this.Warna = Warna;
    }

    // Accessor
    public String getWarna() {
        return Warna;
    }

    // Mutator
    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public void printInfo() {
        System.out.println("Bentuk berwarna " + Warna);
    }
}
