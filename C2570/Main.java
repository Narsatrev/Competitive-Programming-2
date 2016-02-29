import java.io.*;
import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
    while(s.hasNext()){
      String string=s.next();
      String gnirst="";
      for(int i=string.length()-1;i>=0;i--){
        gnirst+=string.charAt(i);
      }
      if(Integer.parseInt(gnirst)>Integer.parseInt(string)){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }

    }
  }
}
