import java.util.Scanner;

public class Tomadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();
        int t4 = sc.nextInt();

        int sum = t1+t2+t3+t4+1;

        System.out.println(sum-4);
        sc.close();
    }
}
