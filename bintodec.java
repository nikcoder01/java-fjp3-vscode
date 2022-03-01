// import java.io.*;
import java.util.*;
public class bintodec
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int ans=0,pow=1;
while(n!=0)
{
    int d=n%10;
    n=n/10;
    ans=ans+(d*pow);
    pow*=2;
}
System.out.println(ans);
sc.close();
}
}