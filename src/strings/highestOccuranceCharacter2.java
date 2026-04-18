package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class highestOccuranceCharacter2 {
    static void main(String[] args) {
        charOccuracnce("bananann");
        charOccuracnce("Software Engineer");

    }
    static void charOccuracnce(String in){
        in= in.toLowerCase().replaceAll(" ","");
        char[] arr= in.toCharArray();
        Map<Character, Integer> map= new LinkedHashMap<>();
        int charCount=0;
        char charValue=' ';
        for (char ch: arr){
            int count= map.getOrDefault(ch,0)+1;
            map.put(ch,count);
            if (count>charCount){
                charCount=count;
                charValue=ch;
            }
        }
        System.out.println("Highest CharCount of char: " + charValue + "->" +charCount);
    }
}
