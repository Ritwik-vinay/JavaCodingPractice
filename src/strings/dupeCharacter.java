package strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class dupeCharacter {
    static void main(String[] args) {
        String  str= "Programming";
        dupeChar(str);

    }
    // Write a program to print duplicate characters
    //from the given String?
    static void dupeChar(String in){
        in= in.toLowerCase().replaceAll(" ","");
        char[] arr= in.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        for (char ch: arr){
            if (!set.add(ch)){
                System.out.println(ch);
            }
        }
    }
}
