
// import java.io.*;
import java.util.*;
public class bubblySort {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[]={6,3,9,1,5,3,2,0};
// Arrays.sort(arr);
for(int i=0;i<arr.length;i++)
{
    for(int j=0;j<arr.length-i-1;j++)
    {
        if(arr[j]>arr[j+1])
        {
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
    }
}
for(int i=0;i<arr.length;i++)
{
    System.out.print(arr[i]+" ");
}
// System.out.println(arr);
sc.close();
}
}