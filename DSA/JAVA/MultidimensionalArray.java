import java.util.Scanner;
import java.util.Arrays;
public class MultidimensionalArray {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int[][] arr2D=new int[3][3];
      for(int r=0;r<3;r++){
        for(int c=0;c<3;c++){
            arr2D[r][c]=sc.nextInt();
        }
    }
     for(int r=0;r<3;r++){
       for(int c=0;c<3;c++){
             System.out.print(arr2D[r][c]+ " ");       
         }
         System.out.println();
      }
    //   for(int r=0;r<arr2D.length;r++){
    //     System.out.println(Arrays.toString(arr2D[r]));
    //   }
    //   USING ENHANCED FOR LOOP
    //   for(int[] a:arr2D){
    //     System.out.println(Arrays.toString(a));
    //   }
    }
}
