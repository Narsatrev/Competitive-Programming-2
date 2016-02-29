import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
    int n = s.nextInt();

    for(int i=0;i<n;i++){

      String x=Long.toBinaryString(s.nextLong());
      boolean hasOne=false;
      boolean hasZero=false;
      for(int j=0;j<x.length();j++){
        if(x.charAt(j)=='1'){
          hasOne=true;
        }
      }
      for(int j=0;j<x.length();j++){
        if(x.charAt(j)=='0'){
          hasZero=true;
        }
      }

      String m;
      if(hasZero&&hasOne){
        m="YES";
      }else{
        m="NO";
      }

      System.out.println(m);

    }
  }
}
