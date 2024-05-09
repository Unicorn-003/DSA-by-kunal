import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //take input from user till user doesnot press X or x
        int ans=0;
        while(true){
            //take operator as input
            System.out.println("enter the opeartor: ");
            char op=sc.next().trim().charAt(0);
            if(op== '+' || op=='-' || op=='*' || op=='/' || op=='%'){
                //input two numbers
                System.out.println("enter two numbers: ");
                int a=sc.nextInt();
                int b=sc.nextInt();

                if(op=='+'){
                    ans=a+b;
                }
                if(op=='-'){
                    ans=a-b;
                }
                if(op=='*'){
                    ans=a*b;
                }
                if(op=='/'){
                    if(b !=0){
                        ans=a/b;
                    }
                }
                if(op=='%'){
                    ans=a%b;
                }
            }else if(op=='x' || op=='X'){
                break;
            }else{
                System.out.println("invalid");
            }
            System.out.println(ans);

        }
    }
}
