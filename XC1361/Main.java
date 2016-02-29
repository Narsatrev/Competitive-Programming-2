import java.io.*;
import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
    while(s.hasNext()){
      double a=s.nextDouble();
      double b=s.nextDouble();
      int c=0;
      for(double i=a;i<=b;i++){
          if(Math.sqrt(i)%1==0){
            if(Math.cbrt(i)%1==0){
              c++;
            }
          }
      }
      System.out.println(c);
    }
  }
}
