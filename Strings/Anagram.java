package Strings;

import jdk.jfr.Frequency;

import java.util.HashMap;

public class Anagram {

    public static HashMap<Character,Integer> freqMap(String s){
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!mp.containsKey(ch)) mp.put(ch,1);
            else  mp.put(ch,mp.get(ch)+1);
        }

        return mp;
    }
    public static boolean isAnagram(String s,String t){
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> mp= freqMap(s);
        for(int i=0;i<t.length();i++){
           char ch=t.charAt(i);
            if(!mp.containsKey(ch)) return false;
            mp.put(ch,mp.get(ch)-1);
        }
        // All values in mp should be 0 for s and t to be anagram
        for(Integer i: mp.values()){
        if(i!=0) return false;
        }
return true;
    }
    public static void main(String[] args) {
     String s= "keen";
     String t= "neke";
        System.out.println(isAnagram(s,t));
    }
}
