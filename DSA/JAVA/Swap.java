import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        // swap();
        swap(2,3);
        
    }
    static void swap(int a,int b){
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter the numbers: ");
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // System.out.println(a+" "+b);
        // int temp=a;
        // a=b;
        // b=temp;
        // System.out.println(a+" "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
}
