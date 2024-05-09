import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,4,23,56,76,34};
        // swap(arr,0,5);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
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
        arr[start]=temp;
    }
}
