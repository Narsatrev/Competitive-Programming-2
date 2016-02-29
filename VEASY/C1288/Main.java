import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
      int k= s.nextInt();

      for(int i=0;i<k;i++){
        String n= s.next();

        if(Character.getNumericValue(n.charAt(n.length()-1))%2==0){
          int sum=0;
          for(int j=0;j<n.length();j++){
            sum+=Character.getNumericValue(n.charAt(j));
          }
          if(sum%3==0){
            System.out.println("YES");
          }else{
            System.out.println("NO");
          }
        }else{
          System.out.println("NO");
        }
      }
    }
  }
