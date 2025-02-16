// Problem Statement
// You are given two arrays, A and B. The array A is of length N and contains N positive integers. The array B is initially empty. At the start, you can take any element from array A and put it in array B. After this initial step, you can take any element from array A and any element from array B. Add the GCD value of these two integers to your score and insert both elements into array B. When you take any element from A, it is automatically deleted from array A. Determine the maximum score you can achieve if you play optimally.

// Input Format
//  The first line of input will be one integer “N” denoting the length of the array A.

// The next line of input contains “N” space separated integers denoting the array elements.

// Output Format
// print an integer denoting the maximum score you can achieve.


import java.util.*;

class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A =new int[N];
        for(int i=0; i<N; i++){
            A[i]=sc.nextInt();
        }
        Arrays.sort(A);
        reverseArray(A);
        List<Integer> B= new ArrayList<>();
        B.add(A[0]);
        int score=0;
       for(int i=1;i<N;i++){
        int bestGCD=0, bestIndex=-1;
        for(int j=i;j<N;j++){
            for(int b:B){
               int gcdValue=gcd(A[j],b);
               if(gcdValue>bestGCD){
                bestGCD=gcdValue;
                bestIndex=j;
               }
            }
        }
        if(bestIndex!=-1){
            B.add(A[bestIndex]);
            score +=bestGCD;

            int temp=A[i];
            A[i]=A[bestIndex]=temp;
        }
       }
       System.out.println(score);
       sc.close();
    }
    private static int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    private static void reverseArray(int[] arr){
        int left=0, right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
