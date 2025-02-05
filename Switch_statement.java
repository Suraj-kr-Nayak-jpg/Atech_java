import java.util.Scanner;

public class Switch_statement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Number");
        int i = sc.nextInt();
        switch (i%2){
            case 0:
                System.out.println("EVEN");
                break;
            case 1:
                System.out.println("ODD");
                break;
            default:
                System.out.println("No value");
        }
    }
}
