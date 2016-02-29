import java.io.*;
import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
    boolean flag=true;

    while(flag){
      int n= s.nextInt();
      long[] arr= new long[n];

      if(n==0){
        flag=!flag;

      }else{
        for(int r=0;r<n;r++){
          arr[r]=s.nextInt();
        }

        Arrays.sort(arr);
        double mediana;

        if(n%2==0){
          mediana = ((double)arr[n/2]+(double)arr[(n/2)-1])/2;
        }else{
          mediana = (double)arr[n/2];
        }

        System.out.println(mediana);
      }
    }
  }
}
//Solucion Github


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {

  static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception{

    int n = Integer.parseInt(in.readLine());
    String readed;
    String[] readedArray;
    long[] longArray;

    while (n != 0){
      longArray = new long[n];
      readed = in.readLine();
      readedArray = readed.split(" ");

      for (int i = 0; i < n; i++){
        longArray[i] = Long.parseLong(readedArray[i]);
      }

      Arrays.sort(longArray);

      if (n%2 == 0){
        System.out.println(String.format("%.1f",(double) (longArray[n/2] + longArray[(n/2) -1]) / 2).replace(",","."));
      } else{
        System.out.println(String.format("%.1f",(double) longArray[n/2]).replace(",","."));
      }

      n = Integer.parseInt(in.readLine());
    }


  }

}
