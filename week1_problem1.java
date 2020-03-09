package com.apps.com;
import java.io.*;
import java.util.*;
public class week1_problem1 {
	public static int [] solution(int [] arr,int n_elements,int [] result,int n_queries) throws IOException
	{
		int left,right,k=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<n_queries;i++)
    	{
    		left=Integer.parseInt(br.readLine());//enter left limit
    		right=Integer.parseInt(br.readLine());//enter right limit
    		result[k]=arr[left];
    		for(int j=left+1;j<=right;j++)
    		result[k]=result[k]^arr[j];
    		k++;
    	}
		
		return result;
		
	}
    public static void main( String args[]) throws IOException
    {
    	//give each input on a separate line
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n_elements,n_queries;
    	n_elements=Integer.parseInt(br.readLine());//enter no of elements
    	int arr[]=new int[n_elements];
    	for(int i=0;i<n_elements;i++)
    	{
    		arr[i]=Integer.parseInt(br.readLine());//enter each element on separate line
    	}
    	n_queries=Integer.parseInt(br.readLine());//enter no of queries
    	int result[] = new int[n_queries];
    	result=solution(arr,n_elements,result,n_queries);//calling solution method
    	
    	for(int i=0;i<n_queries;i++)
    		System.out.println(result[i]);//printing the result
    
}}
