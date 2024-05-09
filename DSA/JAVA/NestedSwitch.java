import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int emp_id=sc.nextInt();
        String department=sc.next();

        switch(emp_id){
            case 111:
            System.out.println("emp. no. is 111");
            break;
            case 222:
            System.out.println("emp. no. is 222");
            switch(department){
                case "IT":
                System.out.println("IT department");
                break;
                case "Management":
                System.out.println("department is Management");
                break;
                default:
                System.out.println("no department");
            }
            break;
            default:
            System.out.println("enter a valid emp_id");
        }
    }
}
