///// BY DEFAULT THE PRIORITY QUEUE IS MINIMUM
// import java.util.PriorityQueue;
// import java.util.*;
// public class priorityQ {
// public static void main(String args[])
// {
// Scanner sc=new Scanner(System.in);
// int a[]={2,6,1,8,32,5,484};
// PriorityQueue<Integer> pq=new PriorityQueue<>();
// for(int ele : a)
// {
//     pq.add(ele);
// }
// while(pq.size() !=0)
// {
//     System.out.println(pq.peek());
//     pq.remove();
// }
// sc.close();
// }
// }



//////TO MAKE THE PRIORITY QUEUE MAXIMUM


import java.util.PriorityQueue;
import java.util.*;
// import java.io.*;
public class priorityQ {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]={2,6,1,8,32,5,484};
PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
for(int ele : a)
{
    pq.add(ele);
}
while(pq.size() !=0)
{
    System.out.println(pq.peek());
    pq.remove();
}
sc.close();
}
}