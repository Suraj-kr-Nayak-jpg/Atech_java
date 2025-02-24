public class Hier_inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
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
class Dog extends animal{

}
class Cat extends animal{

}
