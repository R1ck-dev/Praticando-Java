import java.util.Scanner;

public class LampadasDoHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iA = sc.nextInt();
        int iB = sc.nextInt();
        int fA = sc.nextInt();
        int fB = sc.nextInt();
        int count = 0;

        if (iA != fA) {
            count++;
        } else if (iB != fB) {
            count++;

            iA = (iA == 0) ? 1 : 0;
            
            if (iA != fA) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
