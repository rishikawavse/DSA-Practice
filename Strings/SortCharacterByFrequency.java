package Strings;

import java.sql.SQLOutput;
import java.util.*;

public class SortCharacterByFrequency {
    // " tree" --> "eert" or "eetr"
    // " cccaaa" --> "cccaaa" or "aaaccc"
    // "Aabb" --> "bbAa" or "bbaA"
    static public String frequencySort(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(mp.containsKey(ch)){
                mp.put(ch,mp.get(ch)+1);
            }else{
                mp.put(ch,1);
            }
        }

        List<Map.Entry<Character,Integer>> list=new ArrayList<>(mp.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());

        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer> entry:list){
            char ch=entry.getKey();
            int freq=entry.getValue();
            for(int i=0;i<freq;i++){
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();

        System.out.println(frequencySort(s));
    }
}
