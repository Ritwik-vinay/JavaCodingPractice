package strings;

public class firstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str= "swiss";
        nonRepeatingChar(str);

    }
    static void nonRepeatingChar(String input){
        int[] freq = new int[256];
        for (int i=0; i<input.length();i++){
            freq[input.charAt(i)]++;
        }
        for (int i=0;i<input.length();i++){
            if (freq[input.charAt(i)] == 1){
                System.out.println("First Non Repeating Character "+input.charAt(i));
                return;
            }
        }
        System.out.println("No repeating character found");

    }
}
