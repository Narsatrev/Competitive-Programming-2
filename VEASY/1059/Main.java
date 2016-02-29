import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));

    int n=s.nextInt();

    while(n!=0){
      if(n!=0){
        String x= Integer.toBinaryString(n);
        int c=0;
        for(int i=0;i<x.length();i++){
          if(x.charAt(i)=='1'){
            c++;
          }
        }
        System.out.println("The parity of "+x+" is "+c+" (mod 2).");
      }
      n=s.nextInt();
    }
  }
}
