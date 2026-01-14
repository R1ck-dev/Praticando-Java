import java.util.Scanner;

public class MediaInteira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = (a+b)/2;

        System.out.println(result);

        scanner.close();
    }
}
