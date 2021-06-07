import java.util.*;

import javax.lang.model.util.ElementScanner6;
class BinarySearch{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        int a[]=new int[n];
        int s=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int r=Bsearch(a,0,n,s);
        if(r==1)
        System.out.println("Number found");
        else
        System.out.println("Number not found");
        
        sc.close();
    }
    static int Bsearch(int a[],int start,int end,int s){
        
        if(start>end)
        return 0;
        int mid=(start+end)/2;
        
        if(a[mid]==s)
        return 1;
        else if(a[mid]>s)
        return Bsearch(a, start, mid-1, s);
        else
        return Bsearch(a, mid+1, end, s);
    }

}
