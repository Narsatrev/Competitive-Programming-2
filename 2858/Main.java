import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
    String h= s.nextLine();
    String original="";
    String agrupa="";

    int x=h.length();

    for(int i=0;i<x;i++){
      char charX=h.charAt(i);
      int c=0;
      if(charX=='0'||charX=='1'){
        while(charX=='0'||charX=='1'){
          agrupa+=charX;
          i++;
          charX=h.charAt(i);
        }
        String apurga= new StringBuffer(agrupa).reverse().toString();

        int y=apurga.length();

        BigInteger big= new BigInteger("0");
        for(int j=0;j<y;j++){
          if(apurga.charAt(j)=='1'){
            big=big.add(BigInteger.valueOf((long)Math.pow(2,j)));
          }
        }
        System.out.println(big);
        big= new BigInteger("0");
      }else{
        original+=charX;
      }
    }


  }
}
