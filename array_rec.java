// import java.io.*;
import java.util.*;
public class array_rec {
    public static void arrayfront(int arr[], int idx)
    {
      if(idx<0)
      {
          return;
      }
      arrayfront(arr, idx-1);
      System.out.println(arr[idx]);
    }
    public static int arraymax(int arr[],int idx)
    {
        if(idx == arr.length-1)
        {
            return (arr[idx]);
        }
        int recAns= arraymax(arr, idx+1);
        int mx=arr[idx];
        if(mx>recAns)
        {
            return mx;
        }
        else
        {
            return recAns;
        }
    }
    public static int idxofApp(int arr[],int x,int idx)
    {
      if(idx== arr.length)
      {
          return -1;
      }
      int li=idxofApp(arr, x, idx+1);
      if(li == -1)
      {
          if(arr[idx] == x)
          {
              return idx;
          }
          else
          return li;
      }
      else
      {
          return li;
      }
    }
    public static int[] allindices(int arr[], int idx, int x, int count)
    {
        if(idx==arr.length)
        {
            int a[]=new int[count];
            return a;
        }
        if(arr[idx]==x)
        {
            count=count+1;
        }
        int []recAns = allindices(arr, idx+1, x, count);
        if(arr[idx]==x)
        {
            recAns[count-1] = idx;
        }
        return recAns;
    }
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
    arr[i]=sc.nextInt();
}
int idx=0;
int count=0;
// int idx=arr.length;
// arrayfront(arr,idx);
// int k=arraymax(arr,idx);
System.out.println("Enter no to find first idx \n");
int x=sc.nextInt();
// int k=idxofApp(arr,x,idx);
int k[]=allindices(arr,idx,x,count);
for(int i=0;i<k.length;i++)
{
    System.out.print(k[i]+" ");
}
sc.close();
}
}