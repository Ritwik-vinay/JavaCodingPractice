package strings;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class highestOCcuranceCharacter {
    static void main(String[] args) {
        String in= "aaaaabbcddddd";
        highestOccuranceCharValue(in);

    }
    static void highestOccuranceCharValue(String in){
        in = in.toLowerCase().replaceAll(" ","");
        char[] arr= in.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();
        int maxcount =0;
        char maxcountChar =' ';

        for (char ch: arr){
         int count=  map.getOrDefault(ch,0)+1;
         map.put(ch,count);
         if (count>maxcount){
             maxcount=count;
             maxcountChar=ch;
         }
        }
        System.out.println("Highest occurred character: " + maxcountChar + " -> " + maxcount);
    }
}
