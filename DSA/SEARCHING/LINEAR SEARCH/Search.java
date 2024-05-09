import java.util.Scanner;
import java.util.Arrays;
public class Search{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[7];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("input your target item: ");
        int num=sc.nextInt();
        int ans=linearSearch(arr,num);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr,int item){
       if(arr.length==0){
        return -1;
       } 
       for(int i=0;i<arr.length;i++){
        // int element=arr[i];
        if(arr[i]==item){
            return i;
        }
       }
       return -1;
    }
}