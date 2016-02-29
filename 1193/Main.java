import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
      String n=s.nextLine();

      while(s.hasNextLine()){
        if(!(n.charAt(0)=='+')){
          String l=n.substring(1,n.length()-1);
          l=l.replace("|","X");
          String[] g=l.split("X");

          for(int i=0;i<g.length;i++){
            System.out.print(g[i]);
          }
        }
        System.out.println();
        n=s.nextLine();
      }
    }
    public class Pieza{
      private int posx;
      private int posy;
      private char pieza;

      public int getPosX(){
        return this.posx;
      }
      public int getPosY(){
        return this.posy;
      }

      public char getPieza(){
        return this.pieza;
      }

      public Pieza(int x,int y,char p){
        posx=x;
        posy=y;
        pieza=p;
      }
    }
  }
