import java.util.Scanner;

public class LampadasDoHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iA = sc.nextInt();
        int iB = sc.nextInt();
        int fA = sc.nextInt();
        int fB = sc.nextInt();
        int count = 0;

        if (fB != iB) {
            count++;
            if (iA == 0) {
                fA = 1;
            } else {
                fA = 0;
            }
        }

        if (fA != iA) count++;

        System.out.println(count);
        sc.close();
    }
}
