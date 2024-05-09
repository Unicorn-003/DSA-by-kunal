import java.util.Scanner;
public class TypecastConverse {
    public static void main(String[] args) {
        // Scanner num=new Scanner(System.in);
        // float number=num.nextFloat();
        // System.out.println(number);
        // typecasting
        // int number1=(int)(789.76f);
        // System.out.println(number1);
        int a=257;
        byte b=(byte)(a);
        System.out.println(b);
        // it is out of range for byte hence it gives the remainder of 257%256=1
    }
}
