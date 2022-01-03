//import java.io.*;
import java.util.*;
public class arrraylist
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int data[]={1,3,5,7,12,21,35};
ArrayList<Integer> al=new ArrayList<>();
al.add(10);
for(int x:data)
{
    al.add(x);
}
// for(int x:data)
// {
//    System.out.println(x);
// }




// USER INPUT IN ARRAY_LIST
// for(int i=0;i<5;i++)
// {
//     int val=sc.nextInt();
//      al.add(val);
// }



al.set(1,30);


System.out.println(al);



// System.out.println(al.get(0));

sc.close();
}
}