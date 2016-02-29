import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
      String g= s.nextLine();
      String[] f= g.split(" ");
      if(f[0].equals("square")){
        System.out.println((int)Math.pow(Integer.parseInt(f[1]),2));
      }
      else if(f[0].equals("rectangle")){
        System.out.println(Integer.parseInt(f[1])*Integer.parseInt(f[2]));
      }
    }
  }
