public class Sum_of_Array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int  sum = 0;
//        for (int i=0;i<arr.length;i++) {
//            sum = sum + arr[i];
//        }
        for(int n : arr){
            sum = sum + n;
        }

        System.out.println("sum of all numbers of array : " +sum);
    }
}
