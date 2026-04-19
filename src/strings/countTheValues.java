package strings;

public class countTheValues {
    static void main(String[] args) {
        String in = "Nacre@123%";
        checkCharValues(in);
    }
    static void checkCharValues(String in){
        in= in.toLowerCase().replaceAll(" ","");
        int charCount=0;
        int digitCount=0;
        int specialCharCount=0;
        for (int i=0; i<in.length();i++){{
            if (in.charAt(i)>='a' && in.charAt(i)<='z'||in.charAt(i)>='A' && in.charAt(i)<='Z' ){
                charCount++;
            } else if (in.charAt(i)>='0' && in.charAt(i)<='9') {
                digitCount++;
            }
            else {
                specialCharCount++;
            }
        }
        }
        System.out.println("Charcater count = "+ charCount);
        System.out.println("Digit Count = "+ digitCount);
        System.out.println("Special Char Count= "+ specialCharCount);
    }
}
