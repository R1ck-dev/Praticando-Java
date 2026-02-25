import java.util.Scanner;

public class DivisaoDoTesouro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdMoedas = sc.nextInt();
        int qtdMarinheiros = sc.nextInt();

        int qtdMoedasCapitao = (2*qtdMoedas)/(qtdMarinheiros+2);

        System.out.println(qtdMoedasCapitao);
        sc.close();
    }
}
