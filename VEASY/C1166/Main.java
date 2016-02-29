import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
    int n= s.nextInt();
    for(int i=0;i<n;i++){
      int k=s.nextInt();
      int even=0;
      int odd=0;
      for(int j=0;j<k;j++){
        int m=s.nextInt();
        if(m%2==0){
          even++;
        }else{
          odd++;
        }
      }
      System.out.println(even+" even and "+odd+" odd.");
    }
  }
}
