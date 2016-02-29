import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();

      int a=0;
      int b=0;
      int c=0;

      ArrayList<Integer> l= new ArrayList<Integer>();
      l.add(n1);
      l.add(n2);
      l.add(n3);

      c=Math.max(Math.max(n1,n2),n3);
      int u=0;
      for(int i=0;i<3;i++){
        if(c==l.get(i)){
          u=i;
        }
      }

      l.remove(u);

      int aux1=l.get(0);
      int aux2=l.get(1);
      if(aux1>aux2){
        b=aux1;
        a=aux2;
      }else{
        b=aux2;
        a=aux1;
      }

      String x=s.next();
      switch(x){
        case"ABC":
        System.out.println(a+" "+b+" "+c);
        break;
        case"ACB":
        System.out.println(a+" "+c+" "+b);
        break;
        case"CAB":
        System.out.println(c+" "+a+" "+b);
        break;
        case"CBA":
        System.out.println(c+" "+b+" "+a);
        break;
        case"BAC":
        System.out.println(b+" "+a+" "+c);
        break;
        case"BCA":
        System.out.println(b+" "+c+" "+a);
        break;
      }



    }
  }
