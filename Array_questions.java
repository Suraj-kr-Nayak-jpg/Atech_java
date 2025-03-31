import java.util.Arrays;

public class Array_questions {
    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5};
//        int arr2[]={6,7,8,9,10};
//        int output[] = new int[5];
//
//
//        for (int i=0;i<arr.length;i++){
//            output[i] = arr[i]+arr2[i];
//
//        }
//        System.out.println(Arrays.toString(output));
        int arr[] ={1,5,6,8,7,2,6,78,96,15,268,54,58,255,645};
        int max=arr[0];
        int min=arr[0];
        for(int num:arr){
            if(max<num){
                max=num;
            }
            if (min>num){
                min=num;
            }
        }
        System.out.println("max ="+max);
        System.out.println("min =" +min);



//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-1]);
//

    }
}
