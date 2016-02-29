import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
    float total=0;

    while (s.hasNext()) {
      total+=s.nextFloat();
    }

    System.out.println("$"+String.format("%.2f",total/12));
  }
}
