import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
      String r=s.nextLine();

      ArrayList<Rect> rects= new ArrayList<Rect>();

      while(!r.equals("*")){
        if(!r.equals("*")){
          String[] coord=r.split(" ");
          if(coord[0].equals("r")){
            double a1=Double.parseDouble(coord[1]);
            double b1=Double.parseDouble(coord[2]);
            double c1=Double.parseDouble(coord[3]);
            double d1=Double.parseDouble(coord[4]);
            Rect rect= new Rect(a1,b1,c1,d1);
            rects.add(rect);
          }
        }
        r=s.nextLine();
      }

      int c=0;
      r=s.nextLine();
      while(!r.equals("9999.9 9999.9")){
        if(!r.equals("9999.9 9999.9")){
          String[] punto=r.split(" ");
          double px=Double.parseDouble(punto[0]);
          double py=Double.parseDouble(punto[1]);

          c++;
          boolean flag=true;
          for(int i=0;i<rects.size();i++){

            if((rects.get(i)).dentro(px,py)){
              if(flag){
                flag=!flag;
              }
              System.out.println("Point "+c+" is contained in figure "+(i+1));
            }
          }
          if(flag){
            System.out.println("Point "+c+" is not contained in any figure");
          }

        }
        r=s.nextLine();
      }

    }
    static class Rect{
      private double a;
      private double b;
      private double c;
      private double d;

      public Rect(double a,double b,double c,double d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
      }

      public boolean dentro(double x, double y){
        if(x>0&&y>0){
          if(x>this.a&&x<this.c&&y<this.b&&y>this.d){
            return true;
          }
        }
        return false;
      }

      public String toString(){
        return "Esquina Superior Izquierda: x:"+a+" y:"+b+"\nEsquina Inferior Izquierda: x:"+c+" y:"+d;
      }
    }
  }
