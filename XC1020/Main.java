import java.io.*;
import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
      int n=s.nextInt();
      int k=s.nextInt();

      while(n!=0){

        String[] m= new String[0];
        String x="";

        for(int i=0;i<=k*n*(n-1)/2;i++){
          x= s.nextLine();
          if(x.length()!=0){
            m= x.split(" ");
            System.out.println(x);
          }
        }

        // for(int i=0;i<m.length;i++){
        //   System.out.println(m[i]);
        // }

        n=s.nextInt();
        if(n!=0){
          k=s.nextInt();
        }
      }
  }
}
