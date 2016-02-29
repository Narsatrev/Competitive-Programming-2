import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));

    char[] arrBin= new arrBin[50];
    int n= s.nextInt();

    String nums="";

    for(int i=0;i<n;i++){

        int num=s.nextInt();
        // if(num==0){
        //   System.out.println("YES");
        // }else{
        //
        //   while(num>0){
        //     nums+=num%2;
        //     num=num/2;
        //   }
        //
        //   int l=nums.length()-1;
        //   boolean f=true;
        //
        //   for(int j=0;j<nums.length()/2;j++){
        //     if(nums.charAt(j)!=nums.charAt(l-j)&&f){
        //       f=!f;
        //     }
        //   }

        int c=0;
        String s=:
        System.out.printf("%s\n",f?"YES":"NO");
        nums="";
      }
    }
  }
  public boolean esPalindromo(){
    boolean f=true;
    for(int i=0;i<arrBin.length()>>1;i++){
      if(arrBin[i]!=arrBin[arrBin.length()-1-i]){
        f=false;
        break;
      }
    }
    return f;
  }

}
