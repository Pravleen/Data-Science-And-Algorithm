//Bubble sort
import java.util.*;

import javax.lang.model.util.ElementScanner6;
class BubbleSort{
    
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
       r =Bsort(a,n);
       for(int i=0;i<n;i++){
           System.out.print(r[i]);
       }
       sc.close();
    }
    
       static int[] Bsort(int[] a,int n){
           for(int i=0;i<n-1;i++){
               int flag=0;
               for(int j=0;j<n-i-1;j++){
                   if(a[i]>a[j]){
                   int temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
                   flag=1;
                   }
               }
               if(flag==0)break;
           }
           return a;
       }
      
        
    
        
      
}