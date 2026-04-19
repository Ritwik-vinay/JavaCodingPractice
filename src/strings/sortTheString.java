package strings;

public class sortTheString {
    static void main(String[] args) {
        sortTheGivenString("nacre");
    }

    static void sortTheGivenString(String in) {
        in = in.toLowerCase().replaceAll(" ", "");
        char[] arr = in.toCharArray();
        for (int i = 0; i < in.length(); i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println(new String(arr));
    }
}
