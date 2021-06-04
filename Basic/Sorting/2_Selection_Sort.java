//Selection sort
import java.util.*;

import javax.lang.model.util.ElementScanner6;
class SelectionSort{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        int a[]=new int[n];
       
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
        int r[]=new int[n];
       r =Ssort(a,n);
       for(int i=0;i<n;i++){
           System.out.print(r[i]);
       }
       sc.close();
    }
    static int[] Ssort(int[] a,int n){
        for(int i=0;i<n-1;i++){
            int min_ind=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min_ind]){
                    min_ind=j;
                }

            }
        
            int temp=a[min_ind];
                   a[min_ind]=a[i];
                   a[i]=temp;
          
        }
        
return a;
    }
}