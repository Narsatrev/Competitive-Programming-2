import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
    String x=s.nextLine();
    String n="";
    int c=0;

    while(s.hasNextLine()){
      if(s.hasNextLine()){
      n=s.nextLine();
      int indice=0;
      if(n.contains(x)){
        while(indice!=-1){
          indice=n.indexOf(x,indice);
          if(indice!=-1){
            c++;
            indice+=x.length();
          }
        }
      }

      }
    }
    System.out.println(c);

  }
}
