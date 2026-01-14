import java.util.Scanner;

public class AreaDoQuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int areaQuadrado = (int) Math.pow(l, 2);

        System.out.println(areaQuadrado);

        sc.close();
    }
}
