import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
    int k=s.nextInt();
      for(int i=0;i<k;i++){
        String m=s.next();
        BigInteger n= new BigInteger(m);
        if(n.mod(BigInteger.valueOf(4))==BigInteger.valueOf(0)){
          System.out.println("YES");
        }else{
          System.out.println("NO");
        }
      }
    }
  }
