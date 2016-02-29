import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
    int n=s.nextInt();
    for(int i=0;i<n;i++){
      String st=s.nextLine();
      String buscado=s.nextLine();
      int c=0;
      int index=0;
      if(st.contains(buscado)){
        while(index!=-1){
          index=st.indexOf(buscado,st);
          if(index!=-1){
            c++;
            index++;
          }
        }
      }
      System.out.println("Case "+i+": "+c);
    }
  }
}
