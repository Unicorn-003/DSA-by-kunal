import java.util.Arrays;
public class MaxArray {
    public static void main(String[] args) {
        int[] arr={1,4,23,56,76,34};
        // System.out.println(max(arr));//prints the maximum element in the antire array
        // System.out.println(maxRange(arr,1,3));//prints the max only in given range
        // swap(arr,);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    // static int maxRange(int[] arr,int start,int end){
    //     int maxVal=arr[start];
    //     for(int i=start;i<end;i++){
    //         if(arr[i]>maxVal){
    //             maxVal=arr[i];
    //         }
    //     }
    //     return maxVal;
    //  }
    //  static int max(int[] arr){
    //     int maxVal=arr[0];
    //     for(int i=1;i<arr.length;i++){
    //         if(arr[i]>maxVal){
    //             maxVal=arr[i];
    //         }
    //     }
    //     return maxVal;
    // }
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;//5

        while(start<end){
            //swap
            swap(arr,start,end);
            start++;
            end++;
        }
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

}
}