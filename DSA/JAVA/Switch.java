import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of the fruit: ");
        String fruit=sc.next();

        switch(fruit){

            case "Mango":
            System.out.println("A sweet fruit");
            break;
            case "Orange":
            System.out.println("A round khatta fruit");
            break;
            case "Banana":
            System.out.println("Yeloow sweet fruit");
            break;
            default:
            System.out.println("enter a valid fruit");
            
        }
    }
}
