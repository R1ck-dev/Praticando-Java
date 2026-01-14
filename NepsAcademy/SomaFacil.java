import java.util.Scanner;

public class SomaFacil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = a + b;

        System.out.println(result);

        scanner.close();
    }
}
