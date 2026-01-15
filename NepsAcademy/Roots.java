import java.text.DecimalFormat;
import java.util.Scanner;

public class Roots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");
    
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double x = sc.nextDouble();
            System.out.println(df.format(Math.sqrt(x)));
        }

        sc.close();
    }
}
