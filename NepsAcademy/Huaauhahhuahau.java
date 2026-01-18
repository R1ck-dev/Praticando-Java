import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Huaauhahhuahau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String laughEntrance = sc.next();
        List<Character> vogais = List.of('a', 'e', 'i', 'o', 'u');
        List<Character> laughWithoutConsonant = new ArrayList<>();
        List<Character> laughWithoutConsonantReversed = new ArrayList<>();

        for (int i = 0; i < laughEntrance.length(); i++) {
            if (vogais.contains(laughEntrance.charAt(i))) {
                laughWithoutConsonant.add(laughEntrance.charAt(i));
            }
        }

        for (int i = laughWithoutConsonant.size()-1; i >= 0; i--) {
            laughWithoutConsonantReversed.add(laughWithoutConsonant.get(i));
        }

        if (laughWithoutConsonant.equals(laughWithoutConsonantReversed)) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

        sc.close();
    }
}
