import java.text.DecimalFormat;
import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        String o = sc.next();
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (o.equalsIgnoreCase("M")) {
            System.out.println(df.format(x*y));
        } else {
            System.out.println(df.format(x/y));
        }

        sc.close();
    }
}
