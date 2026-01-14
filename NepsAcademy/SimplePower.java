import java.text.DecimalFormat;
import java.util.Scanner;

public class SimplePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double result = Math.pow(x, y);

        System.out.println(df.format(result));
        sc.close();
    }
}
