import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
//        int arr[];
//        int arr2[] = {1,2,3,4,5,6,7}; // Array initialization with values
//        arr=new int[5];
//        arr[0]=5;
//        arr[1]=6;
//        arr[2]=7;
//        arr[3]=8;
//        arr[4]=9;
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr));

//        int num[] = {1,2,3,4,5,6,7,8,9};
//        Arrays.sort(num);
//        System.out.println(Arrays.toString(num));
//        for(int n:num){
//            System.out.println(n);


//        int arr[] = new int[5];
//        Arrays.fill(arr,100);
//        System.out.println(Arrays.toString(arr));


        int original[] ={1,2,3,4,5,6};
        int copied[] = Arrays.copyOfRange(original,2,5);

        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copied));

        }
    }
//}
