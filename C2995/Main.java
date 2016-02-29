import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
      String x=s.nextLine();
      int n=Integer.parseInt(x);

      String fox="what does the fox say?";

      for(int i=0;i<n;i++){
        String sounds=s.nextLine();
        String st=s.nextLine();

        ArrayList<String> a= new ArrayList<String>();

        String[] arrSounds=sounds.split(" ");

        for(int j=0;j<arrSounds.length;j++){
          a.add(arrSounds[j]);
        }
        while(!st.equals(fox)){
          if(!st.equals(fox)){

            String[] an=st.split(" ");
            if(a.contains(an[2])){
              while(a.remove(an[2])){}
            }
          }
          st=s.nextLine();
        }

        for(int j=0;j<a.size();j++){
          System.out.print(a.get(j)+" ");
        }
        System.out.println();
      }

    }
  }
