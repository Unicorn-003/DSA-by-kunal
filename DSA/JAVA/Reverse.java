public class Reverse{
    public static void main(String[] args) {
        int n=456;
        int res=0;
        while(n>0){
            int rem=n%10;//6,5,0
            n/=10;//45,4,0
            res=res*10+rem;//6,65,654
        }

        System.out.println(res);
    }
}