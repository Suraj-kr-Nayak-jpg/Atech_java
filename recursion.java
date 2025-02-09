public class recursion {
    public static void main(String[] args) {
        int i =8;
        System.out.println("Factorial is" + factorial(i));

    }

    public static int factorial(int i){
        if(i==0){
            return 1;
        }else{
            return i * factorial(i-1);
        }

    }
}
