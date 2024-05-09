import java.util.Scanner;
public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={23,45,12,3,4,5,67,89};
        int target=67;
        System.out.println(search(arr,target,2,7));
    }
    static int search(int[] arr, int item, int start, int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start; i<end; i++){
            if(arr[i]==item){
                return i;
            }
        }
        return -1;
    }
}
