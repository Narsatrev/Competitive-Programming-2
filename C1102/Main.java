import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
    String k="1";

    while(k.charAt(0)!='0'){
      k=s.next();
      if(k.charAt(0)!='0'){
        int sum=0;
        int aux=0;
        for(int i=k.length()-1;i>=0;i--){
          if(aux%2==0){
            sum+=Character.getNumericValue(k.charAt(i));
            aux++;
          }else{

            sum-=Character.getNumericValue(k.charAt(i));
            aux++;
          }
        }
        if(sum%11==0){
          System.out.println(k+" is a multiple of 11.");
        }else{
          System.out.println(k+" is not a multiple of 11.");
        }

      }
    }
  }
}
