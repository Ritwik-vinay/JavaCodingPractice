package practiceJava;

public class staticAndNonStatic {
    //Static and Non Static member
    //Static: Belongs to Class,It has one copy,classname.Variable,No Object Needed,common/Shared Data
    //Non-Static: Belongs to Object,it should saperate per object, object.variable,object required, unique Data
    static String company= "EY";//Shared and commonly used
    int id;//unique

    staticAndNonStatic(int id){
        this.id=id;
    }

    static void main(String[] args) {
        staticAndNonStatic stat= new staticAndNonStatic(1);
        staticAndNonStatic stat2= new staticAndNonStatic(2);
        System.out.println(stat.company);
        System.out.println(stat.id);
        System.out.println(stat2.id);
    }

}
