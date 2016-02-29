import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
      String a=s.next();
      String b=s.next();

      long sum=0;
      for(int i=0;i<a.length();i++){
        for(int j=0;j<b.length();j++){
          sum+=Character.getNumericValue(b.charAt(j))*Character.getNumericValue(a.charAt(i));
        }
      }
      System.out.println(sum);
    }
  }
