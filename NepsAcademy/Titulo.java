import java.util.Scanner;

public class Titulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine().toLowerCase();
        String[] palavras = text.split("\\s+");

        for (int i = 0; i < palavras.length; i++) {
            palavras[i] = palavras[i].substring(0, 1).toUpperCase().concat(palavras[i].substring(1));
        }

        StringBuilder finalText = new StringBuilder();

        for (String palavra : palavras) {
            finalText.append(palavra + " ");
        }

        System.out.println(finalText);

        sc.close();
    }
}
