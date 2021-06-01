//Reverse a numebr
import java.util.*;
class RevNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int revN=ReverseNumber(n);
        System.out.print("Reverse of number "+n);
        System.out.println(" is "+revN);
        sc.close();
    }
    /*static int count(int n){
        int c=0;
        while(n>0){
            c++;
            n=n/10;
        }
        return c;
    }
    static int power(int a,int b){
        if(b==0)
        return 1;
        else
        return a*power(a,b-1);

    }*/
    static int ReverseNumber(int n){
        
        int rev=0;
        int d;
        
     
        while(n>0){
            d=n%10;

            rev=rev*10+d;
           
         
            n=n/10;
        }
        return rev;
    }
}