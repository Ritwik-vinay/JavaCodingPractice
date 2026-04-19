package strings;

public class replaceCharacter {
    public static void main(String[] args) {
        String a = "nacre";
        String b = "java programming";

        char[] in = a.toCharArray();
        char temp = in[0];
        in[0] = in[a.length() - 1];
        in[a.length() - 1] = temp;
        String result = new String(in);
        System.out.println(result);
        //Method 2 preserving spaces
        String[] arr =b.split(" ");
        String first=arr[0];
        String last=arr[arr.length-1];
        char[] c1=first.toCharArray();
        char[] c2= last.toCharArray();


        char temp2 = c1[0];
        c1[0] = c1[first.length() - 1];
        c1[first.length() - 1] = temp2;



        char temp3 = c2[0];
        c2[0] = c2[last.length() - 1];
        c2[last.length() - 1] = temp3;
        StringBuilder sb = new StringBuilder();
        sb.append(c1);
        sb.append(" ");
        sb.append(c2);
        // String result2 = new String(c1+c2);
        System.out.println(sb.toString());

    }
}
