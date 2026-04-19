package strings;

public class checkAnangram {
    static void main(String[] args) {
        System.out.println(checkAnagram("silent","listen"));
        System.out.println(checkAnagram("reaction","creation"));
        System.out.println(checkAnagram("ADAM","dama"));
        System.out.println(checkAnagram("damma","dosmk"));

    }
    static String checkAnagram(String a, String b){
        if (a==null || b==null){
            return "Not ANAGRAM";
        }
        a= a.replaceAll("[^a-zA-z0-9^]","").toLowerCase();
        b=b.replaceAll("[^a-zA-Z0-9^]","").toLowerCase();

        if (a.length()!=b.length()){
            return "NOT ANAGRAM";
        }

        int[] count= new int[256];

        for (int i=0;i<a.length();i++){
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
        }

        for (int c: count){
            if (c!=0){
                return "Not Anagram";
            }
        }
        return "Anagram";
    }
}
