import java.util.Arrays;
import java.util.List;

public class Array_method {
    public static void main(String[] args) {
//        int arr[]={1,2,3,4};
//        int arr2[]={1,2,3,5,4,6};
//        int arr3[]={1,2,3,4,5,6,7,9,12,19,66};
//        int index = Arrays.binarySearch(arr3,12);
//        System.out.println(Arrays.equals(arr,arr3));
//        System.out.println(index);

//        int s[]= {10,20,30,40,50};
//        int d[]=new int[5];
//        System.arraycopy(s,0,d,1,3);
//        System.out.println(Arrays.toString(d));


        String[] fruits={"Apple","Banana","Guava"};
        System.out.println(Arrays.toString(fruits));
        List<String> fruit_list =Arrays.asList(fruits);
        System.out.println(fruit_list);
    }
}
