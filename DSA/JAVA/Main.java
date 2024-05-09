import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        // OUTPUT
        System.out.println(args[2]);
// this works only using javac compiler

        // INPUT
        Scanner input=new Scanner(System.in);
        // System.out.println(input.nextInt());
        int roll=input.nextInt();
        System.out.println("roll number is: "+roll);
    }
}