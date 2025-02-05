import java.util.Scanner;

public class Take_input {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the integer value");
        int a = sc.nextInt();
        System.out.println("Enter the float value");
        float b = sc.nextFloat();
        System.out.println("Enter the string value");
        String c = sc.next();
        System.out.println("int" +a);
        System.out.println("float" +b);
        System.out.println("string" +c);

    }
}
