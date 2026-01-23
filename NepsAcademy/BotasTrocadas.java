import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BotasTrocadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Map<Integer, String>> botas = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            botas.add(Map.of(sc.nextInt(), sc.next()));
        } 

        for (int i = 0; i < botas.size(); i++) {
            Map<Integer, String> parAtual = botas.get(i);

            for (int j = 1; j < botas.size()-1; j++) {
                Map<Integer, String> parProximo = botas.get(j);

                if (parAtual)
            }
        }

        System.out.println(botas);

        sc.close();
    }
}
