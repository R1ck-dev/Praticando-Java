import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Pais implements Comparable<Pais> {
    int id;
    int ouro;
    int prata;
    int bronze;

    public Pais(int id) {
        this.id = id;
        this.ouro = 0;
        this.prata = 0;
        this.bronze = 0;
    }

    @Override
    public int compareTo(Pais outro) {
        if (this.ouro != outro.ouro) {
            return outro.ouro - this.ouro;
        }
        if (this.prata != outro.prata) {
            return outro.prata - this.prata;
        }
        if (this.bronze != outro.bronze) {
            return outro.bronze - this.bronze;
        }
        return this.id - outro.id;
    }
}

public class Olimpiadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            List<Pais> quadroDeMedalhas = new ArrayList<>();
            
            for (int i = 1; i <= n; i++) {
                quadroDeMedalhas.add(new Pais(i));
            }

            for (int i = 0; i < m; i++) {
                int idOuro = sc.nextInt();
                int idPrata = sc.nextInt();
                int idBronze = sc.nextInt();

                quadroDeMedalhas.get(idOuro - 1).ouro++;
                quadroDeMedalhas.get(idPrata - 1).prata++;
                quadroDeMedalhas.get(idBronze - 1).bronze++;
            }

            Collections.sort(quadroDeMedalhas);

            for (int i = 0; i < quadroDeMedalhas.size(); i++) {
                System.out.print(quadroDeMedalhas.get(i).id);
                if (i < quadroDeMedalhas.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }

        sc.close();
    }
}