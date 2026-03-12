package LeetCode;

class ZigZagSolution {
    public String convert(String s, int numRows) {
        String[] linhas = new String[numRows];

        int controladorColuna = 0;
        int controladorLinha = 0;

        // for (String linha : linhas) {
        //     linha = "";
        // }

        for (int i = 0; i < numRows; i++) {
            linhas[i] = "";
        }

        for (int i = 0; i < s.length(); i++) {

            if (i == numRows) {
                controladorColuna++;
            }

            linhas[controladorLinha] += String.valueOf(s.charAt(i));
            if (controladorLinha == 3) {
                controladorLinha = 0;
        }

        for (String linha : linhas) {
            System.out.println(linha);
        }

        return "";
    }
}

public class ZigZagConversion {
    public static void main(String[] args) {
        ZigZagSolution solution = new ZigZagSolution();

        String s = "PAHNAPLSIIGYIR";

        String output = solution.convert(s, 3);
        System.out.println(output);
    }
}

/*
 * [ "........"
 * "........"
 * "........"]
 */