import java.util.*;
class Prime_Number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean b=isPrime(n);

        if(b){
            System.out.println("Is prime");

        }
        else{
            System.out.println("Is not prime");
        }
        sc.close();
    }
        static boolean isPrime(int n){
           if(n==1||n==0)
           return false;
            for(int i=2;i<=n/2;i++){
                
                if(n%i==0){
                    
                    return false;
                
               }
        }
            
            return true;
            
        }
    }

