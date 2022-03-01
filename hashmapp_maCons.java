
// import java.io.*;
// import java.util.*;

// public class hashmapp_maCons {

// public static void main(String[] args) throws Exception 
//   {
//     // write your code here
//     Scanner sc=new Scanner(System.in);
//     HashMap<Integer , Boolean> hm=new HashMap<>();
//     int n=sc.nextInt();
//     int a[]=new int[n];
//     for(int i=0;i<n;i++)
//     {
//         a[i]=sc.nextInt();
//     }
//     for(int i=0;i<n;i++)
//     {
//         hm.put(a[i],true);
//     }
//     for(int i=1;i<n;i++)
//     {
//         if(hm.containsKey(a[i-1]))
//         {
//             hm.put(a[i],false);
//         }
//     }
//     // System.out.println(hm);
// int maxLen=0;
// int StPt=0;
// for(int ele : a)
// {
//     if(hm.containsKey(ele)==true)
//     {
//         int tempLen=1;
//         int tempPt=ele;
//         while(hm.containsKey(ele+tempLen)==true)
//         {
//             tempLen+=1;
//         }
//     }
// }
//   }
// }