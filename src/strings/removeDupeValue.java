package strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDupeValue {
    public static void main(String[] args) {
        String str= "Aabccdeeef";
        removeDupe(str);
    }
    static void removeDupe(String in){
        char[] arr=in.toCharArray();
        String withoutDupe="";
        Set<Character> set = new HashSet<>();
        for (char ch: arr){
            set.add(ch);
        }
        System.out.println(set.toString());

    }
}
