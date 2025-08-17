package Strings;

import java.util.Scanner;

public class RemoveOuterMostParantheses {

    static public String remove(String s){
        String ans="";
        int cnt=0;
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(') cnt++;
            else if(ch==')') cnt--;
            if(cnt==1 && flag==true){
                flag=false;
                continue;
            }
            if(cnt==0 && flag==false){
                flag=true;
                continue;
            }
            ans+=s.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println( remove(s));
    }
}
