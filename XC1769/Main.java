import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
    String s1=s.next();
    String s2=s.next();

    ArrayList<Character> arrs1= new ArrayList<Character>();
    ArrayList<Character> arrs2= new ArrayList<Character>();

    for(int i=0;i<s1.length();i++){
      if(arrs1.indexOf(s1.charAt(i))==-1){
        arrs1.add(s1.charAt(i));
      }
    }

    for(int i=0;i<s2.length();i++){
      if(arrs2.indexOf(s2.charAt(i))==-1){
        arrs2.add(s2.charAt(i));
      }
    }

    Collections.sort(arrs1);
    Collections.sort(arrs2);

    int c=0;
    if(arrs1.size()==arrs2.size()){
      for(int i=0;i<arrs1.size();i++){
        if(arrs1.get(i)==arrs2.get(i)){
          c++;
        }
      }
      if(c==arrs1.size()){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }else{
      System.out.println("NO");
    }


  }
}
