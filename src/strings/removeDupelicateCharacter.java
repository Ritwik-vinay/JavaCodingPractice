package strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDupelicateCharacter {
    public static void main(String[] args) {
        String in= "banana";
        removeDupeChar(in);

    }
    static void removeDupeChar(String in){
        in= in.toLowerCase().replaceAll(" ","");
        char[] arr= in.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        for (char ch: arr){
            set.add(ch);
        }
        System.out.println(set);
    }
}
