import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VogaisEConsoantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Character> vogais = List.of('a', 'e', 'i', 'o', 'u');
        List<Character> vogaisFound = new ArrayList<>();
        List<Character> consoanteFound = new ArrayList<>();

        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            if (vogais.contains(s.charAt(i))) {
                vogaisFound.add(s.charAt(i));
            } else {
                consoanteFound.add(s.charAt(i));
            }
        }

        String vogaisFormatadas = vogaisFound.stream()
                .map(Object::toString)
                .collect(Collectors.joining(""));

        String consoantesFormatadas = consoanteFound.stream()
                .map(Object::toString)
                .collect(Collectors.joining(""));

        System.out.println("Vogais: " + vogaisFormatadas);
        System.out.println("Consoantes: " + consoantesFormatadas);

        sc.close();
    }
}
