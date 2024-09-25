import java.util.Scanner;

public class menghitungLuas {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Menghitung luas dan keliling persegi panjang");
        System.out.println("2. Menghitung luas dan keliling lingkaran");
        System.out.println("3. Menghitung luas dan keliling segitiga\n");

        System.out.print("Pilihan anda: ");
        int menu = scan.nextInt();

        switch (menu) {
            case 1 -> {
                int p,l;
                System.out.println("Pilihan anda adalah persegi panjang");
                System.out.print("Masukkan panjang = ");
                p=scan.nextInt();
                System.out.print("Masukkan lebar   = ");
                l=scan.nextInt();
                System.out.println("");
                System.out.println("Keliling persegi panjang = "+(2*(p+l))+" cm");
                System.out.println("Luas persegi panjang = "+(p*l)+" cm2");
            }
            case 2 -> {
                float rad;
                System.out.println("Pilihan anda adalah lingkaran");
                System.out.print("Masukkan radius = ");
                rad=scan.nextFloat();
                System.out.println("");
                System.out.println("Keliling lingkaran = "+(2*3.14f*rad)+" cm");
                System.out.println("Luas lingkaran = "+(3.14f*rad*rad)+" cm2");
            }
            case 3 -> {
                int a,b,c;
                System.out.println("Pilihan anda adalah segitiga");
                System.out.print("Masukkan a = ");
                a=scan.nextInt();
                System.out.print("Masukkan b = ");
                b=scan.nextInt();
                System.out.print("Masukkan c = ");
                c=scan.nextInt();
                System.out.println("");
                System.out.println("Keliling segitiga = "+(a+b+c)+" cm");
                System.out.println("Luas segitiga = "+((a*b)/2)+" cm2");
            }
            default -> {
                System.out.println("Data tak ditemukan, program dihentikan ...");
            }
        }
    }
}
