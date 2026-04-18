package strings;

public class revTheStringSentence {
    //Write a program to print the reverse of the String?
     public static void main(String[] args) {
         String str= "Java Automation";
         String rev="";
         for (int i=str.length()-1;i>=0;i--){
             rev= rev+ str.charAt(i);
         }
         System.out.println(rev);
    }
}
