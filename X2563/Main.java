import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(System.in);
    int counter;
    while(s.hasNext()){
      String line= s.nextLine();

      int count = line.length() - line.replace("#@", "").length();

      for(int i=0;i<count;i++){
        line = line.replace
      }
      line = line.replace(line.substring(line.indexOf("#@")+2, line.indexOf("@#")+2),"");
      // int countLeft=StringUtils.countMatches(line,"#@");
      // int countRight=StringUtils.countMatches(line,"@#");
      // counter++;
      // if(countLeft==countRight){
      //   System.out.println(countRight+" Line: "+counter);
      // }

    }
  }
}
