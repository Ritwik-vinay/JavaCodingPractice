package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class printDupeCharWithFreq {
    static void main(String[] args) {
        String in = "banana";
        dupeCharWithFreq(in);

    }
    static  void dupeCharWithFreq(String in){
        in= in.toLowerCase().replaceAll(" ","");
        char[] ch= in.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char arr: ch){
            if (map.containsKey(arr)){
                map.put(arr,map.getOrDefault(arr,0)+1);
            }
            else {
                map.put(arr,1);
            }
        }
        for (char c: map.keySet()){
            if (map.get(c)>1){
                System.out.println(c +" = "+ map.get(c));
            }
        }
    }
}
