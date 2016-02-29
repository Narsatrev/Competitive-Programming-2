import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
    int n=s.nextInt();
    for(int m=0;m<n;m++){
      String name=s.next();
      int filas=s.nextInt();
      int columnas=s.nextInt();
      int[][] array= new int[filas][columnas];

      //Rellenar arreglo
      for(int j=0;j<filas;j++){
        for(int k=0;k<columnas;k++){
          array[j][k]=s.nextInt();
        }
      }

      int x=0;
      int y=0;

      for (int i = 0; i < array.length; i++) {
        for (int  j = 0; j < array[i].length; j++) {
          for (x = Math.max(0, i - 1); x <= Math.min(i + 1, array.length); x++) {
            for (y = Math.max(0, j - 1); y <= Math.min(j + 1,
            array[i].length); y++) {
              if (x >= 0 && y >= 0 && x < array.length
              && y < array[i].length) {
                if(x!=i || y!=j){
                  System.out.print(array[x][y] + " ");
                }
              }
            }
          }
          System.out.println("\n");
        }
      }


      // //Encontrar maximo
      // int max=mapa[0][0];
      // int x=0;
      // int y=0;
      // for(int j=0;j<filas;j++){
      //   for(int k=0;k<columnas;k++){
      //     if(mapa[j][k]>max){
      //       max=mapa[j][k];
      //       x=k;
      //       y=j;
      //     }
      //   }
      // }
      //
      //
      // for(int j=0;j<filas;j++){
      //   for(int k=0;k<columnas;k++){
      //
      //   }
      // }
      //
      // System.out.println(max+" "+x+" "+y);

    }
  }
}
