//Jose David Manzanarez Velazquez A01337545
//Carla Lorena Flores SubiasA01331363

import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));

    int numProblemas=s.nextInt();

    for(int i=0;i<numProblemas;i++){
      int minutos=s.nextInt();
      int numEstimados=s.nextInt();
      int[] arrNumEstimados=new int[numEstimados];

      for(int j=0;j<numEstimados;j++){
        arrNumEstimados[j]=s.nextInt();
      }

      int primero;
      int aux=0;

      for(int j=0;j<arrNumEstimados.length-1;j++){
        primero=j;
        for(int k=j+1;k<arrNumEstimados.length;k++){
          if(arrNumEstimados[k]<arrNumEstimados[primero]){
            primero=k;
          }
        }
        aux=arrNumEstimados[primero];
        arrNumEstimados[primero]=arrNumEstimados[j];
        arrNumEstimados[j]=aux;
      }

      int tiempoTotal=5;
      int aux2=0;
      int puntuacion=0;

      for(int j=0;j<arrNumEstimados.length;j++){
        if(tiempoTotal+arrNumEstimados[j]<=minutos){
          aux2++;
          tiempoTotal+=arrNumEstimados[j];
          puntuacion+=tiempoTotal;
        }
      }

      System.out.println(aux2+" "+puntuacion);
    }


  }
}
