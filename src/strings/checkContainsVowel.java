package strings;

public class checkContainsVowel {
    static void main(String[] args) {
        System.out.println(checkVowel("nacre123"));
        System.out.println(checkVowel("ncr123"));
    }
    static String checkVowel(String str){
        str= str.toLowerCase().replaceAll(" ","");
        char[] arr=str.toCharArray();
        for (char ch: arr){
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
              //  System.out.println("contains vowel");
                return "it is vowel";
            }
        }
        return "It doesn't have vowels";
    }
}
