import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Competidor implements Comparable<Competidor> {
    int id;
    int tempo;

    public Competidor(int id, int tempo) {
        this.id = id;
        this.tempo = tempo;
    }

    @Override
    public int compareTo(Competidor outro) {
        return this.tempo - outro.tempo;
    }
}

public class Medalhas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Competidor> lista = new ArrayList<>();

        lista.add(new Competidor(1, sc.nextInt()));
        lista.add(new Competidor(2, sc.nextInt()));
        lista.add(new Competidor(3, sc.nextInt()));

        Collections.sort(lista);

        for (Competidor c : lista) {
            System.out.println(c.id);
        }
        
        sc.close();
    }
}

/*

Quando você chama Collections.sort(lista) passando apenas a lista como argumento, o Java assume que você quer usar a "Ordem Natural" dos objetos.

Para o Java, a "Ordem Natural" é definida justamente pela interface Comparable e seu método compareTo.
O que acontece nos bastidores?

Imagine que o método sort é um organizador de fila cego. Ele não sabe o que é um "Competidor", ele só sabe organizar coisas. Para organizar, ele pega dois objetos da lista (vamos chamar de A e B) e precisa decidir quem vem primeiro.

Como ele não sabe, ele "pergunta" para o objeto A:

    "Ei, objeto A, compare-se com o objeto B."

O código interno do sort faz literalmente isto (simplificando):
Java

// O Java faz algo parecido com isso internamente:
if (objetoA.compareTo(objetoB) < 0) {
    // A é menor que B (vem antes)
} else if (objetoA.compareTo(objetoB) > 0) {
    // A é maior que B (vem depois)
} else {
    // São iguais
}

Por que isso é importante?

    O Contrato: Ao escrever implements Comparable<Competidor>, você assina um contrato com o Java garantindo que sua classe tem o método compareTo. Se você tentar usar Collections.sort(lista) em uma classe que não implementa essa interface, o código nem sequer compila (dá erro).

    A Prioridade: Sim, ele prioriza e busca exclusivamente esse método quando você usa o sort simples.

E se eu quiser ordenar de outro jeito? (A exceção)

Digamos que a "Ordem Natural" (padrão) seja pelo tempo, mas em um relatório específico você queira ordenar pelo ID. Você não precisa mudar a classe.

Você pode dizer ao sort: "Ignore o compareTo padrão e use esta regra aqui" passando um segundo argumento (um Comparator):
Java

// Aqui o Java IGNORA o compareTo da classe e usa a regra que definimos aqui
Collections.sort(lista, (a, b) -> a.id - b.id);

Resumo:

    Collections.sort(lista) -> Busca automaticamente o compareTo da classe.

    Collections.sort(lista, regra) -> Ignora o compareTo e usa a regra fornecida.
*/