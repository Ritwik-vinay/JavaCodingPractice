package strings;

public class removeGivenCharacter {
    static void main(String[] args) {
        String input="Software Engineer";
        char removeChar='e';
        System.out.println(removeCharacter(input,removeChar));
    }
    static String removeCharacter(String in,char removeCh){
        String result="";
        for (int i=0;i<= in.length()-1;i++){
            if (in.charAt(i)!=removeCh){
                result= result+in.charAt(i);
            }
        }
        return result;
    }
}
