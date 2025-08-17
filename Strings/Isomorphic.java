package Strings;

import java.util.HashMap;

public class Isomorphic {

    static public boolean isIsomorphic(String s,String t){
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> mp=new HashMap<>();
        for (int i=0;i<s.length();i++){
            char original= s.charAt(i);
            char replaced=t.charAt(i);

            if(!mp.containsKey(original)){
                if(!mp.containsValue(replaced)){
                    mp.put(original,replaced);
                }
                else{
                    return false;
                }
            }
            else{
                char mappedChar=mp.get(original);
                if(mappedChar!=replaced) return false;
            }
        }
return true;

    }
    public static void main(String[] args) {
        String s="paper";
        String t="title";
        System.out.println(isIsomorphic(s,t));
    }
}
