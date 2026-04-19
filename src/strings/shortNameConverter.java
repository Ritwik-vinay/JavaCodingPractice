package strings;

public class shortNameConverter {
    static void main(String[] args) {
        //Write a Program to print short name of given string
        //Ex: Sanjeeva Reddy Nagar Output: SR Nagar
        System.out.println(shortName("Sanjeeva Reddy Nagar"));
        System.out.println(shortName("Hello World"));
        System.out.println(shortName("Single"));

    }

    static String shortName(String in) {
        StringBuilder sb = new StringBuilder();
        if (in == null) {
            return null;
        }
        String[] words = in.trim().split("\\s+");
        if (words.length == 0) {
            return "";
        }
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].length() > 0) {
                sb.append(Character.toUpperCase(words[i].charAt(0)));
                sb.append(" ");
            }
        }
        sb.append(words[words.length - 1]);
        return sb.toString();
    }
}
