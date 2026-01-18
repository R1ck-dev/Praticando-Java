import java.util.Scanner;
public class FitaColorida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] valueList = new int[n];
        int distance = 9;
        int[] valuesForTape = new int[n];

        for (int i = 0; i < n; i++) {
            valueList[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (valueList[i] == 0) {
                distance = -1;
            }
            distance++;
            valuesForTape[i] = distance;
        }

        distance = 9;

        for (int i = n-1; i >= 0; i--) {
            if (valueList[i] == 0) {
                distance = -1;
            }

            distance++;

            if (distance > 9) distance =9;

            if (distance < valuesForTape[i]) {
                valuesForTape[i] = distance;
            }
        }

        for (int values : valuesForTape) {
            System.out.print(values + " ");
        }

        sc.close();
    }
}
