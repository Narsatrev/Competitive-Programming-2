import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
    int n=s.nextInt();
    for(int i=0;i<n;i++){
      long sum=0;
      int a=s.nextInt();
      int b=s.nextInt();
      for(int j=a;j<=b;j++){
        sum+=(j*(j+1)*(j+2));
      }
      System.out.println(sum%100);
    }
  }
}
