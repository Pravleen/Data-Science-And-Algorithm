//Check if the given string is a palindrome or not
import java.util.*;
class Palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=0;
        for(int i=0,j=s.length()-1;i<s.length();i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                c=1;
                break;
            }
        }
        if(c==1){
            System.out.println("Not a Palindrome");
        }
        else{
            System.out.println("Palindrome");
        }
        sc.close();
    }
}
