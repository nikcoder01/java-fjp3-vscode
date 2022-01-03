import java.util.*;                   //PROGRAM FOR PRINTING DIAMIND
//import java.io.*;
public class pattern_diamond {
    public static void patterns(int n){

      int nsp=n/2,nst=1;  
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
        if(r>(n/2))
        {
            nsp++;
            nst=nst-2;
        }
        else{
        nsp--;
        nst=nst+2; 
        }             
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
