import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
    String p=s.nextLine();
    int n=Integer.parseInt(p);

    for(int i=0;i<n;i++){
      String r= s.nextLine();
      r=r.replace('.','X');
      String[] x=r.split("X");
      int c=0;
      if(x.length==4||x.length==6){
        for(int j=0;j<x.length;j++){
          int num=Integer.parseInt(x[j]);
          System.out.print(num+" ");
          if(num>=0&&num<=255){
            c++;
          }
        }
        if(c==x.length){
          System.out.println("SI");
        }else{
          System.out.println("NO");
        }

      }else{
        System.out.println("NO");
      }
    }
  }
}
