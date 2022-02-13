// import java.io.*;
import java.util.*;
public class primfactt {
    public static void primefact(int x)
    {
      if(x<0)
      {
          return;
      }
      while(x%2==0)
      {
          System.out.println(2+",");
          x=x/2;
      }
      while(x%3==0)
      {
          System.out.println(3+",");
          x=x/3;
      }
      for(int i=5;i<=x;i=i+6)
      {
        while(x%i==0)
        {
            System.out.println(i+",");
          x=x/i;
        }
        while(x%(i+2)==0)
        {
            System.out.println((i+2)+",");
          x=x/(i+2);
        }
      }
      if(x>3)
      {
          System.out.println(x);
      }
    }
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
primefact(x);
sc.close();
}
}