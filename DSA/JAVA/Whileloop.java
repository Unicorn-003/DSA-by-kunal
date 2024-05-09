import java.util.Scanner;
public class Whileloop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        num=1;
        while(num<=10){
            System.out.println("Hello world!");
            num++;
        }
    }
}
