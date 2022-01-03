import java.util.*;
//import java.io.*;
public class helloworld {
        public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Hello World lolololo");
          int x;
          x=sc.nextInt();
          System.out.println("The number is = "+x);
          sc.close();// This closes the scanner object and hence the error vanishes
      }
}
