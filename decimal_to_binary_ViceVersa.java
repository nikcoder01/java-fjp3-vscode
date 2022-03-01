
//import java.io.*;
import java.util.*;
public class decimal_to_binary_ViceVersa {
    public static int dtoab(int n1,int b)
    {
        int pow=1,ans=0;
        while(n1!=0)
        {
          int d=n1%b;
          n1=n1/b;
           ans=ans+(d*pow);
           pow=pow*10;
        }
        return ans;
    }
    public static int abtod(int n2,int b)
    {
        int pow=1,ans=0;
        while(n2!=0)
        {
          int d=n2%10;
          n2=n2/10;
           ans=ans+(d*pow);
           pow=pow*b;
        }
        return ans;
    }
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1,n2;
// System.out.println("Enter decimal to get binary equivalemt");
// n1=sc.nextInt();
System.out.println("Enter base");
int b=sc.nextInt();
// int k=dtoab(n1,b);
// System.out.println("The anybaseequivalent is = "+ k);
System.out.println("Enter anybase to get decimal equivalemt");
n2=sc.nextInt();
int z=abtod(n2,b);
System.out.println("The decimal equivalent is = "+ z);
sc.close();
}
}