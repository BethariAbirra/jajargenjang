import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Perhitungan Luas Jajar Genjang");
        System.out.println("Masukkan panjang alas: ");
        double panjangAlas = input.nextDouble();

        System.out.println(("Masukkan tinggi jajar genjang: "));
        double tinggi = input.nextDouble();

        double luas = panjangAlas * tinggi;

        System.out.println("Luas jajar genjang adalah: "+ luas);
    }
}
