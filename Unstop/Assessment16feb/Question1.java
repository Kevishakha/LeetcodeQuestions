// Problem Statement
// Raj invented a new type of fibonacci series where each element is a binary string ( binary string is a string which contains only “0” and “1” s). In this series F(1) = “0” , F(2) = “1” F(3) = “01” ………..  F(n) = F(n-2) + F(n-1). Puja finds this series interesting and wants to judge whether Raj invented the series on his own or not. So puja will aske q queries and in each query he will give a positive integer n . Raj needs to tell the absolute difference of the number of “0's" and “1's" in F(n). Help Raj to answer all the queries.

// Write a program to determine the  absolute difference of the number of “0's" and “1's" in F(n) for each query.

// As the number can be very large print the answer modulo 1e9+7.

// Input Format
//  The first line of input will be one integer Q denoting the number of queries.

// The next Q line of input will contain a positive integer n.

// Output Format
// For each query print  the absolute difference of the number of “0's" and “1's" in F(n).

// As the number can be very large print the answer modulo 1e9+7.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {
    static final int MOD=1000000007;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int Q=sc.nextInt();
        int[] queries=new int[Q];
        int maxN=0;
        for(int i=0;i<Q;i++){
            queries[i]=sc.nextInt();
            maxN=Math.max(maxN, queries[i]);
        }
        long[] zeroCount=new long[maxN+1];
        long[] oneCount=new long[maxN+1];
        zeroCount[1]=1;
        oneCount[1]=0;
        zeroCount[2]=0;
        oneCount[2]=1;
        for(int i=3; i<=maxN;i++){
            zeroCount[i]=(zeroCount[i-2]+zeroCount[i-1]%MOD);
            oneCount[i]=(oneCount[i-2]+oneCount[i-1]%MOD);
        }
        for(int i=0;i<Q;i++){
            int n=queries[i];
            long diff=Math.abs(zeroCount[n]-oneCount[n])%MOD;
            System.out.println(diff);
        }
       sc.close();
    }
}
