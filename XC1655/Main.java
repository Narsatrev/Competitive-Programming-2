import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));

    while(s.hasNext()){
      String subseq=s.next();
      String seq=s.next();
      String seqComp="";
      int counter=0;

      for(int i=0;i<subseq.length();i++){
        for(int j=0;j<seq.length();j++){
          if(subseq.charAt(i)==seq.charAt(j)){
            seqComp+= seq.charAt(j);
            seq=seq.substring(j+1);
          }
        }
      }
      if(seqComp.equals(subseq)){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }
  }
}
