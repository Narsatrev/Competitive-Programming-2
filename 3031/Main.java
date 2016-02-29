import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
    String n=s.nextLine();
    while(!n.equals("0 0")){
      if(!n.equals("0 0")){
        String[] k= n.split(" ");
        int num= Integer.parseInt(k[0]);
        int den= Integer.parseInt(k[1]);
        int newNum=0;
        int entero=0;

        if(num>=den){
          newNum=num%den;
          entero=num/den;
        }else{
          newNum=num;
          entero=0;
        }

        System.out.println((int)entero+" "+(int)newNum+" / "+(int)den);

      }
      n=s.nextLine();
    }
  }
}
