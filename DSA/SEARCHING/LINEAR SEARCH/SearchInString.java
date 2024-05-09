import java.util.Scanner;
public class SearchInString {
    public static void main(String[] args) {
        String name="Swayanshree";
        char target='q';
        boolean ans=search(name,target);
        System.out.println(ans);
    }
    static boolean search(String str,char item){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(item==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
