package com.apps.com;
import java.io.*;
import java.util.*;
public class week1_problem1 {
	public static int [] solution(int [] input_arr,int [] input_queries,int n_queries,int [] result) throws IOException
	{
		int k=0,i=0,left,right;
		for(i=0;i<n_queries;i++)
    	{
    		left=input_queries[k];
    		k++;//enter left limit
    		right=input_queries[k];//enter right limit

    		k++;
    		result[i]=input_arr[left];
    		for(int j=left+1;j<=right;j++)
    		result[i]=result[i]^input_arr[j];
    	}
		
		return result;
		
	}
    public static void main( String args[]) throws IOException
    {
    	//give each input on a separate line
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n_elements,n_queries,errors=0;
    	n_elements=Integer.parseInt(br.readLine());//enter no of elements
    	int input_arr[]=new int[n_elements];
    	for(int i=0;i<n_elements;i++)
    	{
    		input_arr[i]=Integer.parseInt(br.readLine());//enter each element on separate line
    	}
    	n_queries=Integer.parseInt(br.readLine());//enter no of queries
    	int input_queries[]=new int[2*n_queries];
    	for(int i=0;i<2*n_queries;i++)
    	{
    		input_queries[i]=Integer.parseInt(br.readLine());//enter each element on separate line
    	}
    	int actualout[] = new int[n_queries];
    	actualout=solution(input_arr,input_queries,n_queries,actualout);//calling solution method
    	int expectedout[] = new int[n_queries];
    	for(int i=0;i<n_queries;i++)
    	{
    		expectedout[i]=Integer.parseInt(br.readLine());//enter each element on separate line
    	}
    	
    	for (int i=0; i<n_queries; i++)
        {

            if(expectedout[i] != actualout[i])
            {
                errors++;
            }
        }

        if(errors>0)
        {
            System.out.println(errors + " Errors");
        }
        else
        {
            System.out.println("Passed all cases");
        }
    
}}
