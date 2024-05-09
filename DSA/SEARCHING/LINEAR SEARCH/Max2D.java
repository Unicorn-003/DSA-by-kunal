import java.util.Arrays;
public class Max2D {
    public static void main(String[] args) {
        int[][] arr={
            {1,3,4},
            {76,98,1000,6000},
            {54,34}
        };
        // int ans=maxVal(arr);
        // System.out.println(Arrays.toString(ans));
        System.out.println(maxVal(arr));
        System.out.println(Integer.MIN_VALUE);
    }
    static int maxVal(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                   max=arr[i][j]; 
                }
            }
        }
        return max;
    }
}
