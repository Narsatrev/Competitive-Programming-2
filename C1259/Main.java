import java.util.*;
import java.math.*;

public class Main{
  public static void main(String[] args){
      Scanner s= new Scanner(System.in);
      int n=Integer.parseInt(s.next());



        //Solucion Big Integer
        BigInteger zero= new BigInteger("0");
        BigInteger cuatro= new BigInteger("4");

        for(int i=0;i<n;i++){
          String x=s.next();
          BigInteger num = new BigInteger(x,3);
          BigInteger num2= new BigInteger(num.toString(10));
          if(num2.mod(cuatro).compareTo(zero)==0){
            System.out.println("YES");
          }else{
            System.out.println("NO");
          }


        //Solucion Chaka
        // String c="";
        // int dec=0;
        // int exp=0;
        // int l=x.length();
        // int q=0;
        //
        // if(l>1){
        //   if(l==2){
        //     q=2;
        //   }
        //   else if(l==3){
        //     q=3;
        //   }
        //   else if(l==4){
        //     q=4;
        //   }else{
        //     q=5;
        //   }
        //   exp=q-1;
        //   c=x.substring(x.length()-q);
        //   for(int j=0;j<q;j++){
        //     dec+=Character.getNumericValue(c.charAt(j))*Math.pow(3,exp--);
        //   }
        // }else{
        //   dec=Character.getNumericValue(c.charAt(0));
        // }

        //Solucion Juan
        // String x=s.next();
        // int sum=0;
        // for(int j=0;j<x.length();j++){
        //   if(j%2==0){
        //     sum+=Character.getNumericValue(x.charAt(j));
        //   }else{
        //     sum+=Character.getNumericValue(x.charAt(j));
        //   }
        // }
        // if(dec%4==0){
        //   System.out.println("YES");
        // }else{
        //   System.out.println("NO");
        // }
      }
  }
}
