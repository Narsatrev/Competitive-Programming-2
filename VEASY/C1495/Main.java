import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
    int n=s.nextInt();
    ArrayList<Integer> nums= new ArrayList<Integer>();
    for(int i=0;i<n;i++){
      nums.add(s.nextInt());
    }
    Collections.sort(nums);

    for(int i=0;i<nums.size();i++){
      System.out.println(nums.get(i));
    }
  }
}
