import java.util.*;
class GCD{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=gcd(a,b);
        System.out.println("Gcd is "+c);
    }
    static int gcd(int a,int b){
        if(b!=0){
            return gcd(b,a%b);
        }
        else 
        return a;
    }
}
