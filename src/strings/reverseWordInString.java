package strings;

public class reverseWordInString {
    static void main(String[] args) {
        String str= "Java is best programming language";
        System.out.println(revTheWord(str));
    }
    static String revTheWord(String in){
        String[] arr= in.split(" ");
        String rev="";
        for (int i=0; i<arr.length;i++ ){
            for (int j= arr[i].length()-1;j>=0;j--){
                rev+= arr[i].charAt(j);
            }
            rev= rev+" ";
        }

        return rev;
    }
}
