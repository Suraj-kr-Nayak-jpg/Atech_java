public class superclass {
    public static void main(String[] args) {
        B b =new B();
    }
}
class A{
    A(){
        System.out.println("A");
    }
}
class B extends A{
    B(){
        super(); //call the A's constructor
    }
}
