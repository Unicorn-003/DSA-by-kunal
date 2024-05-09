import java.util.Scanner;
public class Function{
    // public static void main(String[] args) {
        //void return type
        // sum();
        //int return type
        // int ans=sum2();
        // System.out.println(ans);
    // }
    // void return type
    // static void sum(){
    //     Scanner sc=new Scanner(System.in);
    //     int a=sc.nextInt();
    //     int b=sc.nextInt();
    //     int sum=a+b;
    //     System.out.println("sum is: "+sum);
    // }
    // static int sum2(){
    //     Scanner sc=new Scanner(System.in);
    //     int a=sc.nextInt();
    //     int b=sc.nextInt();
    //     int sum=a+b;
    //     return sum;
    // }
    //STRING RETURN TYPE
    // public static void main(String[] args) {
    //     String message=greet();
    //     System.out.println(message);
    // }
    // static String greet(){
    //     String greet="Good afternoon";
    //     return greet;
    // } 
    //PASSING PARAMETER
    // public static void main(String[] args) {
    //     int ans=sum3(3,4);
    //     System.out.println(ans);
    // }
    // static int sum3(int a,int b){
    //     return a+b;
    // }

    // PASSING PARAMETER IN STRING
    public static void main(String[] args) {
        String myself=greet("swayanshree");
        System.out.println(myself);
    }
    static String greet(String name){
        String message="hello " +name;
        return message;
    }
}