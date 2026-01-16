import java.util.Arrays;
import java.util.Scanner;

public class MaiorEntreTresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] valuesList = {a, b, c};

        Arrays.sort(valuesList);

        System.out.println(valuesList[2]);
        sc.close();
        
    }
}
