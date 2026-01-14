import java.util.Scanner;

public class MillionPrize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] viewsPerDay = new int[n];
        int countView = 0;
        int countDays = 0;
        int result = -1;

        for (int i = 0; i < n; i++) {
            viewsPerDay[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            countView += viewsPerDay[i];
            countDays++;
            if (countView >= 1000000) {
                result = countDays;
                break;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
