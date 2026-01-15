import java.util.Scanner;

public class MediaInteiraPonderada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = ((a*4)+(b*6))/10;

        System.out.println(result);

        sc.close();
    }
}
