package strings;

public class checkCapitalAndSmallChar {
    static void main(String[] args) {
        String ch= "Nacre Software";
        checkCapitalAndSmallValues(ch);

    }
    static void checkCapitalAndSmallValues(String in){
        in = in.replaceAll(" ","");
        int capitalCharCount=0;
        int smallCharCount=0;

        for (int i=0;i<in.length();i++){
            if (in.charAt(i)>='A'&& in.charAt(i)<='Z'){
                capitalCharCount++;
            }
            else{
                smallCharCount++;
            }
        }
        System.out.println("Captal Character = "+ capitalCharCount);
        System.out.println("Small Character = "+smallCharCount);
    }
}
