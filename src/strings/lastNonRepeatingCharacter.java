package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class lastNonRepeatingCharacter {
    public static void main(String[] args) {
        String str="swiss";
        getTheLastCharcterNonRepeating(str);
        String in= "Software Services";
        getTheLastCharcterNonRepeating(in);

    }
    static void getTheLastCharcterNonRepeating(String in){
         in= in.toLowerCase().replaceAll(" ","");
         char[] ch = in.toCharArray();
         Map<Character,Integer> map= new LinkedHashMap<>();
         for (char arr: ch){
             map.put(arr, map.getOrDefault(arr,0)+1);
         }
         for (int i=in.length()-1;i>=0;i--){
             char c= in.charAt(i);
             if (map.get(c)==1){
                 System.out.println("The last non repeating character is "+ c);
                 return;
             }
         }
        System.out.println("No Last repeating character found");

    }
}
