public class EvenDigitCount {
    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
        System.out.println(findNumbers(arr));
        // System.out.println(countDigit(123345));
    }
    static int findNumbers(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(even(arr[i])){//12,345
                count++;//1
            }
        }
        return count;
    }
    static boolean even(int i){//12,345
        int numberOfDigit=countDigit(i);
        return numberOfDigit%2==0;//true
    }
    static int countDigit(int num){
       int count=0;
       while(num>count){
        count++;//1,2
        num/=10;//1,34,3
       }
       return count;//3
    }
}
