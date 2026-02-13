import java.util.Scanner;

public class AceleradorDeParticulas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        
        d = d-3;
        d = d-((d/8)*8);

        if (d <= 3) {
            System.out.println(1);
        } else if (d > 3 && d <= 4) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }

        sc.close();

    }
}