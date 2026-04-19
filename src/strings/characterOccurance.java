package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class characterOccurance {
    static void main(String[] args) {
        String str= "Today is Monday";
        charOccur(str);

    }
    static void charOccur(String in){
        in= in.replaceAll("[^a-zA-z0-0^]","").toLowerCase();
        Map<Character,Integer> map = new LinkedHashMap<>();
        char[] arr= in.toCharArray();
        for (char ch: arr){
            if (map.containsKey(ch)){
                map.put(ch, map.getOrDefault(ch,0)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for (char ch: map.keySet()){
            System.out.println(ch +" = "+ map.get(ch));
        }
    }
}
