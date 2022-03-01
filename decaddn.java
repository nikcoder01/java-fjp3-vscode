// import java.io.*;
import java.util.*;
public class decaddn {
 public static int decimaladdn(int n,int m,int b)
 {
   int pow=1,carry=0,ans=0;
   while(n!=0||m!=0||carry!=0)
   {
      int sum=n%10+m%10+carry;
      n=n/10;
      m=m/10;

      // always wriye one that has to be changes before updating value
      carry= sum/b;//// to add it into anybase, just replace b with the desired base 
      sum=sum%b;   //// to add it into anybase, just replace b with the desired base 
      ans+=(sum*pow);
      pow=pow*10;
   }
   return ans;
 }
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int b=sc.nextInt();
System.out.print(decimaladdn(m,n,b));
sc.close();
}
}