import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
    int n=s.nextInt();
    for(int i=0;i<n;i++){
      String st=s.next();
      if(st.length()>10){
        int u=(st.substring(1,st.length()-1)).length();
        System.out.println(st.charAt(0)+""+u+""+st.charAt(st.length()-1));
      }else{
        System.out.println(st);
      }
    }
  }
}
