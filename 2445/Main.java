import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
    String n=s.nextLine();

    int max=0;
    int c=0;

    for(int i=0;i<n.length();i++){
      if(!((i+1)==n.length())){
        char x=n.charAt(i);
        if(x>n.charAt(i+1)){
          while(x>n.charAt(i+1)){
            c++;
          }
        }
        System.out.println(c);
      }
    }
  }
}
