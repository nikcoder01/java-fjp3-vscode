import java.util.*;                   //PROGRAM FOR LOWER PYRAMID
//import java.io.*;
public class pattern_reverse_pyramid {
    public static void patterns(int n){

    int nsp=0,nst=2*n-1;
    //nsp=n-1,nst=1;  for upper pyramid
    for(int r=1;r<=n;r++)
    {
        for(int csp=1;csp<=nsp;csp++)
        {
            System.out.print("\t");
        }
        for(int cst=1;cst<=nst;cst++)
        {
            System.out.print("*\t");
        }
        nsp++;
        nst=nst-2;
        // nsp--;
        // nst=nst+2;                for upper pyramid
        System.out.println();
    }
    
}
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        patterns(n);
        sc.close();
    }
}
