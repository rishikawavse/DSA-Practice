package Strings;

import java.util.Scanner;

public class Toogle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());
        for(int i=0;i<sb.length();i++){
            boolean flag=true;
            char ch= sb.charAt(i);
            if(ch==' ') continue;;
            int ascii=(int)ch;
            if(ascii>=97) flag=false;
            if(flag==true){
                ascii+=32;
                char dh=(char)ascii;
                sb.setCharAt(i,dh);
            }else{
                ascii-=32;
                char dh=(char)ascii;
                sb.setCharAt(i,dh);
            }
        }
    }
}
