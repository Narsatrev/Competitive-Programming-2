import java.util.*;
public class Main{
  public static void main(String[]argsv){

    Scanner s= new Scanner(System.in);
    int n= s.nextInt();

    if(n>=0){
      System.out.println((n*(n+1))/2);
    }else{
      System.out.println((((n*-1)*((n*-1)+1)/2)*-1)+1);
    }


  }
}
