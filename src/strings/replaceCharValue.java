package strings;

public class replaceCharValue {
    static void main(String[] args) {
        //Method 1
        String str= "This is Biil";
        char charreplace='#';
        StringBuilder newStr=new StringBuilder();
        String[] s= str.split(" ");
        for (int i=0;i<s.length;i++){
            newStr.append(s[i].replace('i',charreplace));
            if (i<s.length-1){
                newStr.append(" ");
            }
        }
        System.out.println(newStr);

        //Method 2
        String replacedCharValue= str.replace('i',charreplace);
        System.out.println(replacedCharValue);
    }

}
