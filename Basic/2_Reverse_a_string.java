//Reverse of a string
import java.util.*;
class Reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println("Reverse of "+s+" is "+rev);
        sc.close();
    }
}