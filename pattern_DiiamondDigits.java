import java.util.*;

public class pattern_DiiamondDigits {
    public static void pattern(int n)
    {
        int count;
        int nsp=n/2;
        int nst=1,g=1;
        for(int r=1;r<=n;r++)
        {
            if(r<=(n/2)+1)
            {
             count=r;
            }
            else
            {
                count=n-r+1;
            }
            for(int csp=1;csp<=nsp;csp++)
            {
                System.out.print("\t");
            }
            for(int cst=1;cst<=nst;cst++)
            {
                if(cst<(nst/2)+1)
                {
                System.out.print(count++ +"\t");
                }
                else{
                System.out.print(count-- +"\t");
                }
            }
            if(r>(n/2))
        {
            nsp++;
            nst=nst-2;
            g--;
        }
        else{
        nsp--;
        nst=nst+2;
        g++; 
        } 
        System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        pattern(n);
        scn.close();
    }
}