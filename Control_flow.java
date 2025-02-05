import java.util.Scanner;

public class Control_flow {
    public static void main(String[] args) {
        int i = 4;
        if (i <= 10) {
            if (i <= 5) {
                System.out.println(" yes i is less then 5");
            } else {
                System.out.println("no, i is is not less then 5");
            }
        } else if (i <= 15) {
            System.out.println("Medium");
        } else {
            System.out.println("Big");

        }

    }
}