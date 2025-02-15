import java.util.*;
class Main{
  public static int closestNumber(int n, int m){
        
    int closest=0;
    int minDifference = Integer.MAX_VALUE;
    for(int i= n- Math.abs(m); i <= n+Math.abs(m);i++){
      if(i%m==0){
        int difference = Math.abs(n-i);
        if(difference<minDifference || difference==minDifference && Math.abs(i)>Math.abs(closest) ){
          closest=i;
          minDifference=difference;
        }
      }
    }
    return closest;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n to find its closest which can be divisible by m :");
    int n=sc.nextInt();
    System.out.println("Enter the m to divide n");
    int m=sc.nextInt();
    System.out.println("the closest number of n which is divisible by m is " + closestNumber(n,m));
  }
}
