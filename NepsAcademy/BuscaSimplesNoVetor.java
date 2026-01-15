import java.util.Scanner;

public class BuscaSimplesNoVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valuesList = new int[10];
        
        for (int i = 0; i < 10; i++) {
            valuesList[i] = sc.nextInt();
        }

        int valueToSearch = sc.nextInt();
        boolean found = false;

        for (int value : valuesList) {
            if (value == valueToSearch) {
                found = true;
                break;
            } else {
                continue;
            }
        }

        if (found) {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }

        sc.close();
    }
}
