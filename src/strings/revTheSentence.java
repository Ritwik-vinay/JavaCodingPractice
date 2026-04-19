package strings;

public class revTheSentence {
    static void main(String[] args) {
        String str= "Today is Monday";
        reverseTheSentence(str);
    }
    static void reverseTheSentence(String  in){
        String [] word= in.split(" ");
        String rev="";
        for (int i=word.length-1;i>=0;i--){
            rev+= word[i];
            rev=rev+" ";
        }
        System.out.println(rev);
    }
}
