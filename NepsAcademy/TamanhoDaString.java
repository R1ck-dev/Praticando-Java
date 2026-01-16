import java.util.Scanner;

public class TamanhoDaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        
        System.out.println(s.length());
        sc.close();
    }
}
