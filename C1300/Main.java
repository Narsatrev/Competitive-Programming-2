import java.util.*;

public class Main{
  public static void main(String[] args){
      Scanner s= new Scanner(System.in);
      Set<Integer> set = new HashSet<Integer>();
      for(int i=0;i<10;i++){
        int n= s.nextInt();
        int k=n%42;
        if(i==0){
          set.add(k);
        }
        if(!set.contains(k)){
          set.add(k);
        }
      }
      System.out.println(set.size());
  }
}
