import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x == 0 || y == 0) {
            System.out.println("eixos");
        } else if (x > 0) {
            if (y < 0) {
                System.out.println("Q4");
            } else {
                System.out.println("Q1");
            }
        } else {
            if (y > 0) {
                System.out.println("Q2");
            } else {
                System.out.println("Q3");
            }
        }

        sc.close();
    }
}
