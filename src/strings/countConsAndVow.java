package strings;

public class countConsAndVow {
    //Write a program to count the consonants and
    //vowels from the given String?
    static void main(String[] args) {
        String in="Nacre";
        checkConsCountAndVowCount(in);
    }
    static void checkConsCountAndVowCount(String in){
        in=in.toLowerCase().replaceAll(" ","");
        int cCount=0;
        int vCount=0;
        for (int i=0;i<=in.length()-1;i++){
            if (in.charAt(i)=='a'||in.charAt(i)=='e'||in.charAt(i)=='i'
            ||in.charAt(i)=='o'||in.charAt(i)=='u'){
                vCount++;
            }
            else{
                cCount++;
            }
        }
        System.out.println("Vowel Count present in String are-> "+vCount);
        System.out.println("Consonant Count present in String are-> "+cCount);

    }
}
