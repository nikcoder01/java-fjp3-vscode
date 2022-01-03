// import java.io.*;
import java.util.*;

public class invertedBarChart{
    public static int maximum(int a[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            max=Math.max(a[i],max);
        }
        return max;
    }

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int h=maximum(arr);
    for(int i=1;i<=h;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(arr[j]>=1)
            {
                System.out.print("*\t");
                arr[j]--;
            }
            else
            System.out.print("\t");
        }
        System.out.println();
        sc.close();
    }
 }

}