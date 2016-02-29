import java.util.*;

public class Main{
  public static void main(String[] args){
      Scanner s= new Scanner(System.in);
      int n=Integer.parseInt(s.next());
      for(int i=0;i<n;i++){

        int c=0;
        String x=s.next();

        if(x.length()>1){
          c=Integer.parseInt(x.substring(x.length()-2))%4;
        }else{
          c=Integer.parseInt(x)%4;
        }

        if(c==0){
          System.out.println("YES");
        }else{
          System.out.println("NO");
        }
      }
  }
}
