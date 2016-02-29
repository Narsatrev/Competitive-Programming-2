import java.io.*;
import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
    int n= s.nextInt();
    for(int i=0;i<n;i++){
      String a= s.next();
      String b= s.next();

      int j=Integer.parseInt(a);
      int k=Integer.parseInt(b);
      int c=0;

      int sum=1;

      for(;j<=k;j++){
        String r=String.valueOf(j);
        for(int m=0;m<r.length();m++){
          sum*=Character.getNumericValue(r.charAt(m));
        }
        if(sum%2==0){
          c++;
        }
        sum=1;
      }
      System.out.println(c);
    }
  }
}
