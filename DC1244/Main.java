import java.util.*;
import java.io.*;

public class Main{
      public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        while(!str.equals("*")){
          String s[]=str.split(" ");
          int i=0;
          int done=0;
          while(i<s.length-1){
            //Toma en consideracion las minusculas y mayusculas
            if(s[i].charAt(0)==s[i+1].charAt(0) || s[i].charAt(0)==(char)(s[i+1].charAt(0)-32) || s[i].charAt(0)==(char)(s[i+1].charAt(0)+32))
            i++;
            else
            break;
          }
          //Cuenta cuantas son iguales, si es igual al tamanio del arreglo generado por split pues orale vas
          if(i==s.length-1)
          System.out.println("Y");
          else
          System.out.println("N");
          str=br.readLine();
      }
    //Mi solucion pitera...
    // while(s.hasNext()){
    //   String n=s.nextLine();
    //   if(!n.equals("*")){
    //     String[] arr=n.split(" ");
    //     char x=(arr[0].toLowerCase()).charAt(0);
    //     boolean t=true;
    //     for(int i=1;i<arr.length;i++){
    //       if(x!=(arr[i].toLowerCase()).charAt(0)){
    //         t=!t;
    //       }
    //       System.out.print(arr[i].charAt(0)+",");
    //     }
    //     System.out.println();
    //     if(t){
    //       System.out.println("Y");
    //     }else{
    //       System.out.println("N");
    //     }
    //   }
    // }
  }
}
