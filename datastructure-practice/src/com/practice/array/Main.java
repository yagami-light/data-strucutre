package com.practice.array;// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends




class Solution{
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int sum=0,i=0,j=0;
        Integer start=null,end=null;
        // Your code here
        while((i<n || j< n) ){
            sum+=arr[j];
            if(sum < s){
                j++;
                end=j;
                
            }
            if(sum>s){
                sum-=arr[i];
                i++;
                start=i;
            }

            if(s==sum)
                break;
            
        }
        
System.out.print("start "+ start + "end"+ end);
    //Integer[] response={start,end};
        ArrayList result=new ArrayList();
      result.add(start);
      result.add(end);
      return  result;
    }
}