package arrays;

import java.util.Arrays;

public class sortTheArrayString {
    static void main(String[] args) {
        String[] arr={"Tuesday", "Thursday","Sunday","Monday"};
        sortTheArray(arr);
    }

    static void sortTheArray(String[] in) {
        int len = in.length;

        for (int i = 0; i < in.length; i++) {
            for (int j = i + 1; j < in.length; j++) {
                if (in[i].compareTo(in[j])>0) {
                    String temp= in[i];
                    in[i]=in[j];
                    in[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(in));
    }
}
