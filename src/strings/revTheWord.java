package strings;

public class revTheWord {
    public static void main(String[] args) {
        String word="Java Autoamtion";
        String rev="";
        String[] words= word.split(" ");

        for (int i=words.length-1;i>=0;i--){
            rev= rev+ words[i] + " ";
        }
        System.out.println(rev);
    }
}
