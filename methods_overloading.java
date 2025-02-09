public class methods_overloading {
    public static void main(String[] args) {
        s(12,15);
        s(11.5,12.5);
        s("Hello","World");
        s("Its",15);

    }

    public static void s(int a , int b) {
        System.out.println(a+b + "This is a integer value");
    }
    public static void s(double a , double b) {
        System.out.println(a+b + "This is a double value");
    }

    public static void s(String a , String b) {
        System.out.println(a+b + "This is a string value");
    }
    public static void s(String a , int b) {
        System.out.println(a+b + "This is string and intger value");

    }
}
