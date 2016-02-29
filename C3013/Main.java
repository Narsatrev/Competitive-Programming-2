import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(System.in);
    int n= s.nextInt();

    for(int i=0;i<n;i++){
      int x=s.nextInt();
      System.out.println((2<<(x-1))-1);
    }

    // int z=101011;
    // //A|B Union
    // System.out.println(10000|11111);
    // //A&B Interseccion
    // System.out.println(10000&11111);
    // //A-B Resta
    // System.out.println(10000&~11111);
    // //Negacion TRUE~A
    // System.out.println(111111111111111
    // //Set Bit z|=1<<n
    // //Clear Bit z&=~(1<<n)
    // System.out.println(z|=1<<8);
  }
}
