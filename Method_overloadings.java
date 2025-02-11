public class Method_overloadings {
    public static void main(String[] args) {
        a(10,12,15);
        a(22,66);
        a(5.0f,6.2f,7.8f);
    }

    public static void a(int a,int b,int c) {
        System.out.println("Sum of three integer value" +(a+b+c));
    }

    public static void a(int a,int b) {
        System.out.println("Sum of two intger value:"+(a+b));
    }

    public static void a(float a,float b,float c) {
        System.out.println("Sum of Three float value:"+(a+b+c));

    }
}
