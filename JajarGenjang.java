/**
 * Kelas ini menghitung luas jajar genjang.
 */
public class JajarGenjang {
    private double alas;
    private double tinggi;

    /**
     * Konstruktor untuk membuat objek JajarGenjang dengan panjang alas dan tinggi.
     *
     * @param alas   Panjang alas jajar genjang.
     * @param tinggi Tinggi jajar genjang.
     */
    public JajarGenjang(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    /**
     * Menghitung luas jajar genjang.
     *
     * @return Luas jajar genjang.
     */
    public double hitungLuas() {
        return alas * tinggi;
    }

    /**
     * Main method untuk menguji kelas JajarGenjang.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam contoh ini).
     */
    public static void main(String[] args) {
        JajarGenjang jg = new JajarGenjang(5.0, 3.0);
        double luas = jg.hitungLuas();
        System.out.println("Luas Jajar Genjang: " + luas);
    }
}