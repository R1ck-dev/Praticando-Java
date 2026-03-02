import java.util.Scanner;

public class DroneDeEntrega {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int h = sc.nextInt();
        int l = sc.nextInt();

        if ((a <= h && b <= l) || (b <= h && a <= l)) {
            System.out.println("S");
        } else if ((a <= h && c <= l) || (c <= h && a <= l)) { 
            System.out.println("S");
        } else if ((b <= h && c <= l) || (c <= h && b <= l)) { 
            System.out.println("S");
        } else {
            System.out.println("N");
        }

        sc.close();
    }
}
