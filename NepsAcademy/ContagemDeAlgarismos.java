import java.util.Scanner;

public class ContagemDeAlgarismos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] numbers = new String[n];
        int[] count = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            String currentNumber = numbers[i];

            for (int j = 0; j < currentNumber.length(); j++) {
                if (currentNumber.charAt(j) == '0') {
                    count[0]++;
                } else if (currentNumber.charAt(j) == '1') {
                    count[1]++;
                } else if (currentNumber.charAt(j) == '2') {
                    count[2]++;
                } else if (currentNumber.charAt(j) == '3') {
                    count[3]++;
                } else if (currentNumber.charAt(j) == '4') {
                    count[4]++;
                } else if (currentNumber.charAt(j) == '5') {
                    count[5]++;
                } else if (currentNumber.charAt(j) == '6') {
                    count[6]++;
                } else if (currentNumber.charAt(j) == '7') {
                    count[7]++;
                } else if (currentNumber.charAt(j) == '8') {
                    count[8]++;
                } else if (currentNumber.charAt(j) == '9') {
                    count[9]++;
                }
            }
        }

        System.out.println("0 - " + count[0]);
        System.out.println("1 - " + count[1]);
        System.out.println("2 - " + count[2]);
        System.out.println("3 - " + count[3]);
        System.out.println("4 - " + count[4]);
        System.out.println("5 - " + count[5]);
        System.out.println("6 - " + count[6]);
        System.out.println("7 - " + count[7]);
        System.out.println("8 - " + count[8]);
        System.out.println("9 - " + count[9]);

        sc.close();
    }
}
