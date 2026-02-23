import java.util.Scanner;

public class Irmaos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int otavio = sc.nextInt();
        int oscar = sc.nextInt();

        System.out.println((oscar-otavio)+oscar);
        sc.close();
    }
}
