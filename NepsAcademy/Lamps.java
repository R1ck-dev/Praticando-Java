import java.util.Scanner;

public class Lamps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean lampA = false;
        boolean lampB = false;

        int n = sc.nextInt();
        int[] lampPressed = new int[n];
        
        for (int i = 0; i < n; i++) {
            lampPressed[i] = sc.nextInt();
        }

        for (int i = 0; i < lampPressed.length; i++) {
            if (lampPressed[i] == 1) {
                lampA = !lampA;
            } else if (lampPressed[i] == 2) {
                lampA = !lampA;
                lampB = !lampB;
            }
        }

        System.out.println(lampA ? 1 : 0);
        System.out.println(lampB ? 1 : 0);

        sc.close();
    }
}
