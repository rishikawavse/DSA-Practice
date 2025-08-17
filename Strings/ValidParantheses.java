package Strings;

import java.util.Scanner;

public class ValidParantheses {

    static public boolean isAlphanumeric(char c){
        if((c>='0' && c<='9') ||(Character.toLowerCase(c)>='a' && Character.toLowerCase(c)<='z')){
            return true;
        }
        return false;
    }
    static  public boolean isPalindrome(String s) {
        int st=0,end=s.length()-1;
        while(st<=end){
            if(!isAlphanumeric(s.charAt(st))){
                st++;
                continue;
            }
            if(!isAlphanumeric(s.charAt(end))){
                end--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(st))!=Character.toLowerCase(s.charAt(end))){
                return false;
            }
            st++;
            end--;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println( isPalindrome(s));
    }
}
