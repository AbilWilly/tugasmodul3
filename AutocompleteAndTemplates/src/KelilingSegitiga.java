import java.util.Scanner;

public class KelilingSegitiga {
    public static double hitungKeliling(double sisiA, double sisiB, double sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan panjang sisi A segitiga: ");
        double sisiA = input.nextDouble();//Masukkan sisi A Segitiga

        System.out.println("Masukkan panjang sisi B segitiga: ");
        double sisiB = input.nextDouble();//Masukkan sisi B Segitiga

        System.out.println("Masukkan panjang sisi C segitiga: ");
        double sisiC = input.nextDouble();//Masukkan sisi C Segitiga

        double keliling = hitungKeliling(sisiA, sisiB, sisiC);

        System.out.println("Keliling segitiga adalah: " + keliling);

        input.close();
    }
}
