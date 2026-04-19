package strings;

public class checkAnagramLogic {
    static void main(String[] args) {
        String a ="listen";
        String b= "silent";
        System.out.println(anagramChecker(a,b));
    }
    static String anagramChecker(String a, String b){
        if (a == null || b == null) {
            return "NOT_ANAGRAM";
        }

        // Normalize: remove spaces/special chars, convert to lowercase
        a = a.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        b = b.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (a.length()!=b.length()){
            return "Not ANAGRAM";
        }
        int[] count= new int[256];
        for (int i=0;i<a.length();i++){
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
            }
        for (int c: count){
            if (c!=0){
                return "Not AnaGram";
            }
        }
        return "IS ANAGRAM";
    }
}
