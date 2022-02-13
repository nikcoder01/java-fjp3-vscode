// import java.io.*;
import java.util.*;

public class max_min {
  public static int secmax(int a[])
  {
    int maxx=0,secmaxx=0;
    for(int i=0;i<a.length;i++)
    {
      if(maxx<a[i])
      {
       maxx=a[i];
        secmaxx=maxx;
      
      }
    }
    return secmaxx;
  }

  public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int arr[]=new int[x];
    for(int i=0;i<x;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println(secmax(arr));
    sc.close();
  }
}
