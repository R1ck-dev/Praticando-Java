package LeetCode;

class SolutionLongestPalindromicSubstring {
    public String longestPalindrome(String s) {

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromCenter(s, i, i);
            int len2 = expandFromCenter(s, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }

        }
        return s.substring(start, end + 1);

    }

    public int expandFromCenter(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return end - start - 1;
    }
}

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        SolutionLongestPalindromicSubstring solu = new SolutionLongestPalindromicSubstring();

        String s = "babad";
        String output = solu.longestPalindrome(s);
        System.out.println(output);
    }
}
