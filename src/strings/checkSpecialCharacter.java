package strings;

public class checkSpecialCharacter {
    //Write a program to whether check given string
    //contains Special Characters or not?+
    static void main(String[] args) {
        String str = "nacre123@#";
        String ans="";
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)>='a'&& str.charAt(i)<='z' ||
                    str.charAt(i)>='A'&& str.charAt(i)<='Z' ||
                    str.charAt(i)>='0' && str.charAt(i)<='9'
            ) {
                ans += str.charAt(i);

            }
        }
        System.out.println(ans);
    }

}
