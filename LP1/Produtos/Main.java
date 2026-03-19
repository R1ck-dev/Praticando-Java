package LP1.Produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int QTD_ITEM = 3;

        System.out.println("===DADOS DA NOTA FISCAL===");
        System.out.println("Informe o número");
        int numero = sc.nextInt();

        sc.nextLine();

        System.out.println("Data de emissão");
        String data = sc.nextLine();

        System.out.println("Observação");
        String obs = sc.nextLine();

        NotaFiscal oNota = new NotaFiscal(numero, data, obs, new ArrayList<>());

        System.out.println("===DADOS DO ITEM===");
        for (int i = 0; i < QTD_ITEM; i++) {
            Itens oItem = new Itens();
            Produto oProduto = new Produto();

            oItem.setProduto(oProduto);

            System.out.println("Item " + i);

            oItem.setNumItem(i + 1);

            System.out.println("Informe a quantidade: ");
            oItem.setQtdItem(sc.nextInt());

            sc.nextLine();

            System.out.println("Informe o código do produto: ");
            oItem.getProduto().setCodProduto(sc.nextInt());

            sc.nextLine();

            System.out.println("Informe a descrição do produto:");
            oItem.getProduto().setDescProduto(sc.nextLine());

            System.out.println("Informe o valor unitário: ");
            oItem.getProduto().setValorUnit(sc.nextDouble());

            oNota.setItem(oItem);

        }

        sc.close();
    }
}
