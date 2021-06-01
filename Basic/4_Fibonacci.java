//Fibonacci series 0 1 1 2 3 5 8.....
import java.util.*;
class Fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Series(n);
        sc.close();
    }
    static void Series(int n){
        if(n==0){
        System.out.println("0");}
        
        if(n==1){
        System.out.println("0 1");}
        int a=0,b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(n-->0){
            int c=a+b;
           
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}