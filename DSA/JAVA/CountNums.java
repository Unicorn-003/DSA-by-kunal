// import java.util.Scanner;
public class CountNums {
    public static void main(String[] args) {
        int n=56786646;
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==6){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
}
