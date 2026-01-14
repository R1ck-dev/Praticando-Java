import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] sequence = new int[n];
        int count100 = 0;

        for (int i = 0; i < n; i++) {
            sequence[i] = sc.nextInt();
        }

        for (int i = 0; i < sequence.length - 2; i++) {
            if (sequence[i] == 1 && sequence[i+1] == 0 && sequence[i+2] == 0) {
                count100++;
            }
        }

        System.out.println(count100);
        sc.close();
    }
}
