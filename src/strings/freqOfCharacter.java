package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class freqOfCharacter {
    static void main(String[] args) {
        String in ="banana apple";
        freqOfCharacter(in);

    }
    static void freqOfCharacter(String in){
        in= in.toLowerCase().replaceAll(" ","");
        char[] arr= in.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (char ch: arr){
            if (map.containsKey(ch)){
                map.put(ch, map.getOrDefault(ch,0)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        for (char c: map.keySet()){
            System.out.println(c + " = "+ map.get(c));
        }
    }
}
