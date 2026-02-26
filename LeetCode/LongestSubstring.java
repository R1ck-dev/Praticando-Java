package LeetCode;

import java.util.HashSet;
import java.util.Set;

class SolutionLongest {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int esquerda = 0, direita = 0, maximo = 0;
        Set<Character> set = new HashSet<>();
        
        while (direita < n) {
            if (!set.contains(s.charAt(direita))) {
                set.add(s.charAt(direita));
                maximo = Math.max(maximo, (direita-esquerda)+1);
                direita++;
            } else {
                set.remove(s.charAt(esquerda));
                esquerda++;
            }
        }

        return maximo;
    }
}

public class LongestSubstring {
    public static void main(String[] args) {
        SolutionLongest solu = new SolutionLongest();
        String s = "abcabcbb";

        int output = solu.lengthOfLongestSubstring(s);
        System.out.println(output);
    }
}
