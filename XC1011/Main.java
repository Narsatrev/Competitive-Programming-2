import java.io.*;
import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
    int n=s.nextInt();

    for(int i=0;i<n;i++){
      int gN= s.nextInt();
      int mN= s.nextInt();

      ArrayList<Integer> godzillaArmy= new ArrayList<Integer>();
      ArrayList<Integer> mechaGodzillaArmy= new ArrayList<Integer>();

      for(int j=0;j<gN;j++){
        godzillaArmy.add(s.nextInt());
      }

      for(int j=0;j<mN;j++){
        mechaGodzillaArmy.add(s.nextInt());
      }
      // 
      // Collections.sort(godzillaArmy);
      // Collections.sort(mechaGodzillaArmy);


      while(!godzillaArmy.isEmpty()&&!mechaGodzillaArmy.isEmpty()){
        if(godzillaArmy.get(0)==mechaGodzillaArmy.get(0)){
          int j=0;
          int k=0;
          int c=0;

          Iterator iteratorG = godzillaArmy.iterator();
          Iterator iteratorM = mechaGodzillaArmy.iterator();

          while(godzillaArmy.get(0)==iteratorG.next()&&iteratorG.hasNext()){
            j++;
          }
          while(mechaGodzillaArmy.get(0)==iteratorM.next()&&iteratorM.hasNext()){
            k++;
          }

          if(j==k){
            mechaGodzillaArmy.remove(0);
          }else if(j>k){
            mechaGodzillaArmy.remove(0);
          }else{
            godzillaArmy.remove(0);
          }
        }

        else if(godzillaArmy.get(0)<mechaGodzillaArmy.get(0)){
          godzillaArmy.remove(0);
        }
        else{
          mechaGodzillaArmy.remove(0);
        }
      }

      if(mechaGodzillaArmy.isEmpty()){
        System.out.println("Godzilla");
      }else if(godzillaArmy.isEmpty()){
        System.out.println("MechaGodzilla");
      }
    }
  }
}
