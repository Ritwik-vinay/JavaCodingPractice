package strings;

public class revTheWords {
    public static void main(String[] args){
        String sentence="Java Automation Selenium";
        String rev="";
        String[] words=sentence.split(" ");

        for (int i=0; i<=words.length-1;i++){
            for (int j=words[i].length()-1;j>=0;j--){
                rev+= words[i].charAt(j) ;
            }
            rev= rev+ " ";
        }
        System.out.println(rev);
    }
}
