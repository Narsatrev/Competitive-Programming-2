import java.util.*;

public class Main{
  public static void main(String[] args){

    List<Integer> listaPrimos= new ArrayList<Integer>();
//     listaPrimos.add(2);
//     listaPrimos.add(3);
//     
//     boolean flag=true;
//     for(int i=5;i<=1000001; i+=2){
//     	for(int j=0;j<listaPrimos.size();j++){
//     		if(i%listaPrimos.get(j)==0){
//     			flag=false;
//     			break;
//     		}
//     	}
//     	if(flag){
//     	    listaPrimos.add(i);
//     	}    	
//     	flag=true;
//     }
//     
//     for(int k=0;k<200;k++){
//     	System.out.println(listaPrimos.get(k));
//     }

	boolean[] arrPrimos= new boolean[1000001];
	for(int k=0;k<arrPrimos.length;k++){
		arrPrimos[k]=true;
	}
	
	arrPrimos[0]=false;
	arrPrimos[1]=false;	
	arrPrimos[2]=true;	
	arrPrimos[3]=true;			
	
	for(int i=2;i<1000001;i++){
		if(arrPrimos[i]){
			listaPrimos.add(i);
			for(int j=(i+i);j<1000001;j+=i){
				arrPrimos[j]=false;
			}
		}
	}
	
	for(int i=0;i<arrPrimos.length;i++){
		if(arrPrimos[i]){
			listaPrimos.add(i);
		}		
	}
	
    
    int n;
	boolean flag=true;
    Scanner s= new Scanner(System.in);
	n= s.nextInt();
	 while(n!=0){
	 	for(int i=0;i<listaPrimos.size()&&n-listaPrimos.get(i)>=0;i++){
	 		if(arrPrimos[n-listaPrimos.get(i)]==true){
	 			flag=false;
	            System.out.println(n+" = "+listaPrimos.get(i)+" + "+(n-listaPrimos.get(i)));	 			
	            break;
	 		}		 	
    	}    	
    	if(flag){
          System.out.println("Goldbach's conjecture is wrong.");          
      	}
    	n=s.nextInt();	
  }
}
}

