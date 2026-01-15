
import java.util.Scanner;

public class Inverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valuesList = new int[10];

        for (int i = 0; i < 10; i++) {
            valuesList[i] = sc.nextInt();
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(valuesList[i]);
        }

        sc.close();
    }
}
