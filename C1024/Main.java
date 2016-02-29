import java.io.*;
import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
    boolean flag=true;

    do{
      float n=s.nextFloat();

      if(n==0.00){
        flag=!flag;
      }

      float x=0;
      float c=2;

      while(x<n&&n!=0){
        x+=1/c;
        if(x<n){
          c++;
        }
      }

      if(n!=0.00)
        System.out.println((int)(c-1)+" card(s)");

    }while(flag);
  }
}
