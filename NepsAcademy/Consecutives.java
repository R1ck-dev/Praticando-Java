import java.util.Scanner;

public class Consecutives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] valuesList = new int[n];
        int mostSortedNumberCount = 1;
        int countingActual = 0;

        for (int i = 0; i < n; i++) {
            valuesList[i] = sc.nextInt();
        }

        for (int i = 0; i < valuesList.length; i++) {
            if (i + 1 == n) {
                if (i > 0 && valuesList[i] == valuesList[i - 1]) {
                    countingActual++;
                    if (countingActual > mostSortedNumberCount) {
                        mostSortedNumberCount = countingActual;
                    }
                    countingActual = 0;
                }
            } else {
                if (valuesList[i] == valuesList[i + 1]) {
                    countingActual++;
                } else {
                    if (i > 0 && valuesList[i] == valuesList[i - 1]) {
                        countingActual++;
                        if (countingActual > mostSortedNumberCount) {
                            mostSortedNumberCount = countingActual;
                        }
                        countingActual = 0;
                    } else {
                        if (countingActual > mostSortedNumberCount) {
                            mostSortedNumberCount = countingActual;
                            countingActual = 0;
                        } else {
                            countingActual = 0;
                        }
                    }
                }
            }
        }
        if (countingActual > mostSortedNumberCount) {
            mostSortedNumberCount = countingActual;
        }

        System.out.println(mostSortedNumberCount);
        sc.close();
    }
}