import java.io.*;
import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class leapye
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
if(x%400==0)
{
    System.out.println("leap yr");
}
else if(x%100==0)
{
    System.out.println(" not leap yr");
}
else if(x%4==0)
{
    System.out.println("leap yr");
}
else 
{
    System.out.println("not leap yr");

}
}
}