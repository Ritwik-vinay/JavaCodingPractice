package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepeatingChar {
    public static void main(String[] args) {
        String str= "Software Services";
        firstNonRepeatingChar(str);

    }
     static void firstNonRepeatingChar(String str){
        str= str.toLowerCase().replaceAll(" ","");
        char[] arr= str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch: arr){
            if (map.containsKey(ch)){
                map.put(ch, map.getOrDefault(ch, 0)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for (Map.Entry<Character, Integer> entry: map.entrySet()){
            if (entry.getValue()==1){
                System.out.println("First Non Repeating Char value: "+ entry.getKey());
                return;
            }
        }
        System.out.println("No Non Repeating char present ");

    }
}
