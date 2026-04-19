package strings;

public class percentageOfStringDigitAndSpecialChar {
    static void main(String[] args) {
        //Write a program to find the percentages of
        //characters, Digits and Special characters from the
        //given String?
        String in ="Nacre@123%";
        calculatetheValue(in);
    }
    static void calculatetheValue(String in){
        in=in.toLowerCase().replaceAll(" ","");
        float len = in.length();
        int charCount=0;
        int digitCount=0;
        int specialCharCount=0;
        for (int i=0;i<in.length();i++){
            if (in.charAt(i)>='a'&& in.charAt(i)<='z'){
                charCount++;
            } else if (in.charAt(i)>='0' && in.charAt(i)<='9') {
                digitCount++;
            }else {
                specialCharCount++;
            }
        }
        float c= (charCount/len)*100;
        float d= (digitCount/len)*100;
        float s= (specialCharCount/len)*100;

        System.out.println("Character : "+String.format("%.2f", c)+"%" +
                "\nDigit : "+String.format("%.2f", d)+"%" + "\nSpecial : "+
                String.format("%.2f", s)+"%");
    }
}
