package practiceJava.polymorphism;

public class polymorphism {
    static void main(String[] args) {
        pets p= new cat();
        p.sound("Meow");
        pets p2= new dog();
        p2.sound("Bark");
    }
}
class pets{
    void sound(String sound){
        System.out.println(sound);
    }
}
class dog extends pets{
    void sound(String sound){
        sound="bark";
        System.out.println(sound);
    }
}
class cat extends  pets{
    void sound(String sound){
        sound="Meow";
        System.out.println(sound);
    }
}
