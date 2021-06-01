//factorial of a number
import java.util.*;
class Factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=factorial(n);
        System.out.println(f);
        sc.close();
    }
    static int factorial(int n)
    {
        if(n==1)
        return 1;
        if(n==2)
        return 2;
        return n*factorial(n-1);
    }
}