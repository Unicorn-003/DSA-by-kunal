import java.util.Arrays;
import java.util.Scanner;
public class ArrayDeclaration {
    public static void main(String args[]){
        Scanner element=new Scanner(System.in);
        int[] arr=new int[5];
        // array declaration
        // byte[] rnos=new byte[5];
        // System.out.println(rnos[1]);

        //taking inputs from user using for loop
        for(int i=0;i<arr.length;i++){
            arr[i]=element.nextInt();
        }
        System.out.println(Arrays.toString(arr));//it creates array using elements with proper array design
        // for(int i=0;i<5;i++){
        //     System.out.print(arr[i]+"  ");
        // }
        //using enhance for loop
        // for(int num: arr){
        //     System.out.print(num+"  ");
        // }
        
        //ARRAY OF STRING
        String[] str=new String[3];
        for(int i=0;i<str.length;i++){
            str[i]=element.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
