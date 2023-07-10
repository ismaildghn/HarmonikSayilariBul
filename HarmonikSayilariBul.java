import java.util.Scanner;

public class HarmonikSayilariBul {
    public static void main(String[] args) {

        Scanner imp = new Scanner(System.in);
        int n;

        System.out.print("n sayısını giriniz : ");
        n = imp.nextInt();

        double result = 0;

        for (double i = 1; i <= n; i++){
            result += 1/i;
        }
        System.out.println(result);
    }
}
