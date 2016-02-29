import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(System.in);
    int n= s.nextInt();
    for(int i=0;i<n;i++){
      int x=s.nextInt();
      System.out.println((2<<(x-1))-1);
    }
  }
}
