import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CobraCoral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] listOfColors = new int[4];
        Set<Integer> countingColors = new HashSet<>();
        boolean itIs = false;

        for (int i = 0; i < 4; i++) {
            listOfColors[i] = sc.nextInt();
            countingColors.add(listOfColors[i]);
        }

        if (countingColors.size() == 3) {
            if (listOfColors[0] == listOfColors[2]) {
                itIs = true;
            } else if (listOfColors[1] == listOfColors[3]) {
                itIs = true;
            }
        }

        if (itIs) {
            System.out.println("V");
        } else {
            System.out.println("F");
        }

        sc.close();
    }
}
