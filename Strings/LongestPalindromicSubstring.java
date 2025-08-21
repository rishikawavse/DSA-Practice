package Strings;

public class LongestPalindromicSubstring {
    static public String longestPalindrome(String s) {
        if (s.length() <= 1) return s;
        String lps = "";

        for (int i = 1; i < s.length(); i++) {
            // Odd length palindrome
            int l = i, h = i;
            while(s.charAt(l)==s.charAt(h)){
                l--;
                h++;
                if(l==-1 || h==s.length()){
                    break;
                }
            }

            String palindrome=s.substring(l+1,h);
            if(palindrome.length()>lps.length()) lps=palindrome;

            // checking for even length
            l=i-1;
            h=i;
            while(s.charAt(l)==s.charAt(h)){
                l--;
                h++;
                if(l==-1 || h==s.length()) break;
            }

            palindrome=s.substring(l+1,h);
            if(palindrome.length()>lps.length()) lps=palindrome;


        }

        return lps;
    }

    public static void main(String[] args) {
        String s="babad";
        System.out.println(longestPalindrome(s));
    }
}
