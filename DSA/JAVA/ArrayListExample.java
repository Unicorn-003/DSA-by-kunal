import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
        // list.add(234);
        // list.add(321);
        // list.add(567);
        // list.add(908);
        // list.add(1);

        //TO CHECK 
        // System.out.println(list.contains(234));

        //UPDATE VALUE
        // list.set(0,99);

        //REMOVE
        // list.remove(2);
        // System.out.println(list);

        // TAKING INPUTS
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }

        // GET ITEM AT ANY INDEX
        for(int i=0;i<5;i++){
            System.out.println(list.get(3));
            break;
        }
        System.out.println(list);
    }
}
