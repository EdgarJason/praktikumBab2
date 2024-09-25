import java.util.Scanner;

public class programGaji {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jam;

        System.out.print("Jam kerja = ");
        jam = scan.nextInt();

        int upah = jam*5000;
        int lembur = (jam-60)*6000;
        int denda = (50-jam)*1000;
        String line = "------------------------------------------------";

        if (jam>=60) {
            System.out.println("Upah = Rp. "+(60*5000));
            System.out.println("Lembur = Rp. "+((jam-60)*6000));
            System.out.println("Denda = Rp. 0");
            System.out.println(line);
            System.out.println("Total = Rp. "+(300000+lembur));
        }

        else if (jam<0){
            System.out.println("Input tidak valid!");
        }

        else if (jam<=50) {
            System.out.println("Upah = Rp. "+(jam*5000));
            System.out.println("Lembur = Rp. 0");
            System.out.println("Denda = Rp. "+(50-jam)*1000);
            System.out.println(line);
            System.out.println("Total = Rp. "+(upah-denda));
        }

        else {
            System.out.println("Upah = Rp. "+(jam*5000));
            System.out.println("Lembur = Rp. 0");
            System.out.println("Denda = Rp. 0");
            System.out.println(line);
            System.out.println("Total = Rp. "+upah);
        }
    }
}
