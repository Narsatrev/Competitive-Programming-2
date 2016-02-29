import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
      String nums=s.nextLine();

      while(!nums.equals("0")){
          String[] x= nums.split(" ");
          int a=Integer.parseInt(x[0]);
          int b=Integer.parseInt(x[1]);
          int c=Integer.parseInt(x[2]);

          double a1=Math.pow(a,2);
          double b1=Math.pow(b,2);
          double c1=Math.pow(c,2);

          if(a1+b1==c1||b1+c1==a1||a1+c1==b1){
            System.out.println("right");
          }else{
            System.out.println("wrong");
          }
          nums=s.nextLine();
      }
    }
  }
