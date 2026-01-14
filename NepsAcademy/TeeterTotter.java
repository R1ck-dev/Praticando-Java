import java.util.Scanner;

public class TeeterTotter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p1 = sc.nextInt();
        int c1 = sc.nextInt();
        int p2 = sc.nextInt();
        int c2 = sc.nextInt();

        int result = 0;

        if ((p1*c1)==(p2*c2)) {
            result = 0;
            System.out.println(result);
        } else if ((p1*c1)>(p2*c2)) {
            result = -1;
            System.out.println(result);
        } else {
            result = 1;
            System.out.println(result);
        }

        sc.close();

    }
}
