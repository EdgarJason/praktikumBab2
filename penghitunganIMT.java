import java.util.Scanner;

public class penghitunganIMT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double bb,tb,hasil;

        System.out.println("PROGRAM PENGHITUNGAN INDEKS IMT");
        System.out.print("Berat badan (kg) = ");
        bb = scan.nextDouble();
        System.out.print("Tinggi badan (m) = ");
        tb = scan.nextDouble();
        hasil = bb/(tb*tb);

        if (hasil <= 18.5){
            System.out.printf("IMT = %.2f",hasil);
            System.out.println(" Termasuk kurus");
        }
        else if (hasil > 18.5 && hasil <= 25){
            System.out.printf("IMT = %.2f",hasil);
            System.out.println(" Termasuk normal");
        }
        else if (hasil > 25 && hasil <= 30){
            System.out.printf("IMT = %.2f",hasil);
            System.out.println(" Termasuk gemuk");
        }
        else if (hasil > 30){
            System.out.printf("IMT = %.2f",hasil);
            System.out.println(" Termasuk kegemukan");
        }
        else {
            System.out.println("Tidak valid");
        }
    }
}
