import java.util.Scanner;

public class FailApprovedFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double avg = ((n1*2)+(n2*3))/5;

        if (avg >= 7) {
            System.out.println("Aprovado");
        } else if (avg < 3) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Final");
        }

        sc.close();
    }
}
