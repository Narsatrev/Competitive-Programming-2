import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
      int n=s.nextInt();
      for(int i=0;i<n;i++){
        System.out.println((i+1)+": I am participating in the Engineer's day.");
      }
    }
}
