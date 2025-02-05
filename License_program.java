import java.util.Scanner;

public class License_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("yes you are eligible fot license");
        }else {
            int remaining_age = 18-age;
            System.out.println("No you are not eligible for license. you have to wait for "+ remaining_age +"years");
        }
    }
}
