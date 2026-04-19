package strings;

public class checkPalindromeString {
    static void main(String[] args) {
        String in= "madam";
        System.out.println(checkPalindrome(in));
        System.out.println(checkPalindrome("ritwik"));
    }
    static String checkPalindrome(String in){
        in=in.replaceAll("[^a-zA-Z0-9^]","").toLowerCase();
        String org=in;
        String rev="";
        for (int i=in.length()-1;i>=0;i--){
            rev+=in.charAt(i);
        }
        if (org.equalsIgnoreCase(rev)){
            return "ITS PALINDROME";
        }
        return "NOT PALINDROME";
    }
}
