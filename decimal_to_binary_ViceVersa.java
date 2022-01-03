
//import java.io.*;
import java.util.*;
public class decimal_to_binary_ViceVersa {
    public static int dtob(int n1)
    {
        int pow=1,ans=0;
        while(n1!=0)
        {
          int d=n1%2;
          n1=n1/2;
           ans=ans+(d*pow);
           pow=pow*10;
        }
        return ans;
    }
    public static int btod(int n2)
    {
        int pow=1,ans=0;
        while(n2!=0)
        {
          int d=n2%10;
          n2=n2/10;
           ans=ans+(d*pow);
           pow=pow*2;
        }
        return ans;
    }
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1,n2;
System.out.println("Enter decimal to get binary equivalemt");
n1=sc.nextInt();
int k=dtob(n1);
System.out.println("The binaryequivalent is = "+ k);
System.out.println("Enter binary to get decimal equivalemt");
n2=sc.nextInt();
int z=btod(n2);
System.out.println("The decimal equivalent is = "+ z);
sc.close();
}
}