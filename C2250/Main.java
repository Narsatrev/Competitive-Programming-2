import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
    String x=s.nextLine();
    int n=Integer.parseInt(x);

    for(int i=0;i<n;i++){
      String st=s.nextLine();
      String buscado=s.nextLine();
      int c=0;
      int index=0;
      if(st.contains(buscado)){
        while(index!=-1){
          index=st.indexOf(buscado,index);
          if(index!=-1){
            c++;
            index++;
          }
        }
      }
      System.out.println("Case "+(i+1)+": "+c);
    }

  }
}
