
// import java.io.*;
import java.util.*;
public class decsubn {
    public static int subtr(int m,int n)
    {
       int ans=0,pow=1,carry=0;
       while(m!=0)  // given m>n
       {
          int subn=carry+m%10-n%10;
          m=m/10;
          n=n/10;
          if(subn<0)
          {
              carry=-1;
              subn+=10;
          }
          else{
          carry=0;
          }
          ans=ans+(subn*pow);
          pow*=10;
       }
       return  ans;
    }
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
System.out.println(subtr(m,n));
sc.close();
}
}