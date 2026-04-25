package practiceJava.encapsulation;
public class encapsulation {
    //Binding of the data and method in a class using the access modifier is known as the encapsulation

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
class runner{
    static void main() {
        encapsulation encap= new encapsulation();
        encap.setUserName("Ritwik");
        System.out.println(encap.getUserName());
        encap.setPassword("Lucky");
        System.out.println(encap.getPassword());
    }
}
