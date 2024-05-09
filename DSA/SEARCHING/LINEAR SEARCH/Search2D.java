import java.util.Arrays;
public class Search2D {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,34,4},
            {65,78,43},
            {5,6}
        };
        int item=6;
        int[] ans=search(arr,item);//format of return value {row,col}
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int item){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==item){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
