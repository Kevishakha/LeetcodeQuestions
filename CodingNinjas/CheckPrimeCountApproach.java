import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int count=0;
		if(N<=1){
         System.out.print("false");
		 return ;
		}
		for(int i=2;i*i<=N;i++){
			if(N%i==0){
              count++;
			  if((N/i)!=i){
				  count++;
			  }
			}
			
		}
		if(count==0){
				System.out.print("true") ;
				
			}else{
				System.out.print("false") ;
				
			}
		
	}
}
