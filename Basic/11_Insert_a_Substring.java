import java.util.*;
class InsertSubString{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
        String sub=sc.next();
        int pos=sc.nextInt();
        System.out.println(s);
        insert(s,sub,pos);

        
        sc.close();
    }
    static void insert(String s,String sub,int p)
    {
        int a=s.length();
        int b=sub.length();
        int c=a+b;
        char ch[]=new char[c];
        for(int i=0;i<p;i++)
        ch[i]=s.charAt(i);
        for(int i=p;i<(p+b);i++)
        ch[i]=sub.charAt(i-p);
        for(int i=(p+b);i<c;i++)
        ch[i]=s.charAt(i-b);
        for(int i=0;i<c;i++){
            System.out.print(ch[i]);
        }
    }
}