import java.util.*;
class SwapbyRef{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before swap "+a+" "+b);
        swap(a,b);
        
       
        sc.close();
    }
    static void swap(int a,int b){
       int temp=a;
       a=b;
       b=temp;
        System.out.println("After swap "+a+" "+b);

    }
}