import java.util.*;
import java.io.*;

public class Div11{
  public static void main(String[]args){
    Scanner s= new Scanner(System.in);
    int x= Integer.parseInt(s.next());
    for(int j=0; j<x;j++){
      String n= s.next();
      int par=0;
      int impar=0;
      int l=0;
      int div9=0;
      
      int div5=(n.charAt(n.length()-1)-'0');
      if(div5%5==0){
        for(int i=0;i<n.length();i++){
          l=n.charAt(i)-'0';
          if(i%2==0){
            par+=l;
          }else{
            impar+=l;
          }
          div9+=l;
        }
        if(div9%9==0){
          if((par-impar)%11==0){
            System.out.println("YES");
          }else{
            System.out.println("NO");
          }
        }else{
          System.out.println("NO");
        }
      }else{
        System.out.println("NO");
      }
    }
  }
}
