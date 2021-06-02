import java.util.*;
class Power{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int p=power(a,b);
        System.out.println(p);
       
        sc.close();
    }
    static int power(int a,int b){
        if(b==0)
        return 1;
        if(b==1)
        return a;
        return a*power(a, b-1);
    }
}