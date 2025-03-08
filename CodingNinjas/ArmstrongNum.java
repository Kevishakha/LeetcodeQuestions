import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static boolean isArmstrong(int num)
	{
		int power= (int)(Math.log10(num)+1);
		int sum=0;
		int temp =num;
	    // wrtie your code here;
		while(num > 0){
			int ld=num % 10;
			sum += Math.pow(ld,power);
			num=num/10;
		}

		if(sum==temp){
			return true;
		}else{
			return false;
		}
	}
}
