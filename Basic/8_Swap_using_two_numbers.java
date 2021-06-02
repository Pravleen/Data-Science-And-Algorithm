import java.util.*;


class Swap2numbers{
    static int a,b;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before swap "+a+" "+b);
        swap();
        
        System.out.println("After swap "+a+" "+b);
        sc.close();
    }
    static void swap(){
        a=a+b;
        b=a-b;
        a=a-b;

    }
}