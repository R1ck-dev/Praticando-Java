package LeetCode;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode atual = dummyHead;
        int resto = 0;

        // Continua se l1 tiver nós, ou l2 tiver nós, ou se sobrou um "vai um" no final
        while (l1 != null || l2 != null || resto != 0) {
            // Pega os valores; se a lista já acabou (for null), considera como 0
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            // Faz a soma completa daquela coluna
            int soma = val1 + val2 + resto;

            // Calcula o "vai um" para a próxima rodada (ex: 15 / 10 = 1)
            resto = soma / 10;
            
            // Conecta o novo nó usando apenas o dígito da unidade (ex: 15 % 10 = 5)
            atual.next = new ListNode(soma % 10);
            atual = atual.next; // Avança o nosso construtor para o nó recém-criado

            // Avança os ponteiros de l1 e l2, se eles ainda existirem
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummyHead.next; // Retorna a lista pulando o nó falso
    }
}

public class AddTwoSum {

    // 1. Método auxiliar para percorrer e imprimir a lista
    public static void imprimirLista(ListNode no) {
        System.out.print("[");
        
        // Enquanto o nó atual não for nulo, continuamos caminhando
        while (no != null) {
            System.out.print(no.val); // Imprime o número
            
            // Se houver um próximo nó, imprime uma vírgula para separar
            if (no.next != null) {
                System.out.print(", ");
            }
            
            // Avança o ponteiro para o próximo nó da lista
            no = no.next;
        }
        
        System.out.println("]");
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(2, new ListNode(4, new ListNode(3)));

        ListNode list2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        Solution solution = new Solution();

        ListNode output = solution.addTwoNumbers(list1, list2);

        imprimirLista(output);
    }
}