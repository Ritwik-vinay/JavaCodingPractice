package strings;

public class stringContainsDigit {
    static void main(String[] args) {
        System.out.println(checkDigitOccurance("nacre123 "));
        System.out.println(checkDigitOccurance("nacre#$"));

    }
    static  boolean checkDigitOccurance(String in){
        boolean hasDigit=false;
        in= in.toLowerCase().replaceAll(" ","");
        char[] arr= in.toCharArray();
        for (char ch: arr){
            if (Character.isDigit(ch)){
                return !hasDigit;
            }
        }
        return hasDigit;
    }
}
