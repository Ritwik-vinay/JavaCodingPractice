package practiceJava;

public class overloadingChecker {
    public static void main(String[] args) {
        System.out.println(sumOfTwo(1,1));
        System.out.println(sumOfTwo(55.6,66.4));
        System.out.println(sumofTwo("Ritwik","vinay"));
    }
    static double sumOfTwo(double a, double b){
        return a+b;
    }
    static int sumOfTwo(int a , int b){
        return a+b;
    }
    static String sumofTwo(String a, String b){
        return a.concat(b);
    }
}
