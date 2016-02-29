
import java.util.*;
import java.io.*;
import java.math.*;

public class Div11_2{
  public static void main(String[]args){
    Scanner s= new Scanner(System.in);
    int x= Integer.parseInt(s.next());
    BigInteger xn,n495,zero;
    zero= new BigInteger("0");
    n495=new BigInteger("495");

    for(int j=0; j<x;j++){
      String n= s.next();
      xn= new BigInteger(n);
      if(xn.mod(n495).compareTo(zero)==0){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }
  }
}
