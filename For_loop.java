import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value");
        int num = sc.nextInt();
        for(int i=1; i<=10;i++){
            System.out.println(i*num);
        }
    }
}
