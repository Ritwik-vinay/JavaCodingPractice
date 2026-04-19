package strings;

public class percentageOfVowAndCons {
    static void main(String[] args) {
        String in="Consonents";
        vowConsPercentage(in);
    }

    static void vowConsPercentage(String in) {
        in = in.toLowerCase().replaceAll(" ", "");
        float len = in.length();
        int cCount=0;
        int vCount=0;
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == 'a' || in.charAt(i) == 'e' || in.charAt(i) == 'i' ||
            in.charAt(i) == 'o' || in.charAt(i) == 'u'){
                vCount++;
            }
            else {
                cCount++;
            }
        }
        float v=(vCount/len)*100;
        float c=(cCount/len)*100;

        System.out.println("Vowel Count ->"+ String.format("%.2f",v)+ "%");
        System.out.println("Consonant Count -> "+ String.format("%.2f",c)+ "%");
    }
}
