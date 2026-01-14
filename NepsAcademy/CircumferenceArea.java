import java.text.DecimalFormat;
import java.util.Scanner;

public class CircumferenceArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double r = sc.nextDouble();
        double area = 3.1416*(Math.pow(r, 2));

        System.out.println(df.format(area));
        sc.close();
    }
}
