import java.util.Scanner;

public class BasqueteDeRobos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();

        if (d <= 800) {
            System.out.println(1);
        } else if (d <= 1400) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }

        sc.close();
    }
}
