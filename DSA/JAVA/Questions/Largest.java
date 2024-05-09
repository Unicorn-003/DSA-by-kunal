package Questions;
import java.util.Scanner;
public class Largest {
    // print the largest number
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int b=n.nextInt();
        int c=n.nextInt();
        // one method
    //     if(a>b && a>c){
    //         System.out.println("a is the largest: "+a);
    //     }else if(b>a && b>c){
    //         System.out.println("b is the largest: "+b);
    //     }else{
    //         System.out.println("c is the largest: "+c);
    //     }
    // }
    // another method
        // int max=a;
        // if(b>max){
        //     max=b;
        // }
        // if(c>max){
        //     max=c;
        // }
        // System.out.println(max);
        // another method using lang
        int max= Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
