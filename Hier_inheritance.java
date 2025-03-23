public class Hier_inheritance {
    public static void main(String[] args) {
        dog d = new dog();
        d.sound("Bhaw");
        Cat c = new Cat();
        c.sound("meow");
    }
}
class animal{
    void sound(String s){
        System.out.println(s);

    }
}
class dog extends animal{

}
class Cat extends animal{

}
