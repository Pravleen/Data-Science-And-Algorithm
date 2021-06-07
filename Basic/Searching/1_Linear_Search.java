//Linear search using recursion
import java.util.*;
class LinearSearch{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        int a[]=new int[n];
        int s=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int r=search(0,a,n,s);
        if(r==1)
        System.out.println("Number found");
        else
        System.out.println("Number not found");
        
        sc.close();
    }
    static int search(int index,int[] a,int n,int s){
        if(index>=n){
        return 0;
        }
        else if(a[index]==s){
            return 1;
        }
        else
        return search(index+1, a, n, s);

    }
}
