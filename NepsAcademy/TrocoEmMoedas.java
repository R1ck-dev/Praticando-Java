import java.util.Scanner;

public class TrocoEmMoedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int[] listOfChange = {0, 0, 0, 0, 0, 0};

        while (c > 0) {
            if (c >= 100) {
                listOfChange[0] = c/100;
                c = c-(listOfChange[0]*100);
                continue;
            }
            if (c >= 50) {
                listOfChange[1] = c/50;
                c = c-(listOfChange[1]*50);
                continue;
            }
            if (c >= 25) {
                listOfChange[2] = c/25;
                c = c-(listOfChange[2]*25);
                continue;
            }
            if (c >= 10) {
                listOfChange[3] = c/10;
                c = c-(listOfChange[3]*10);
                continue;
            }
            if (c >= 5) {
                listOfChange[4] = c/5;
                c = c-(listOfChange[4]*5);
                continue;
            }
            if (c >= 1) {
                listOfChange[5] = c/1;
                c = c-(listOfChange[5]*1);
                continue;
            }
        }

        int sum = 0;
        for (int coin : listOfChange) {
            sum+=coin;
        }

        System.out.println(sum);

        for (int coin : listOfChange) {
            System.out.println(coin);
        }

        sc.close();
    }
}