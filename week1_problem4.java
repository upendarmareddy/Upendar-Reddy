import java.io.*;
import java.util.*;

public class week1_problem4 {
    public static boolean ispoweroftwo(int n)
    {
        return ((n&(n-1))==0);
    }
    public static int [] min_replacements(int input[],int n,int result[])    // applying bruteforce technique
    {
        int count,a;
        for(int i=0;i<n;i++)
        {
            count=0;     //Initializing count to zero for each input
            a=input[i];  //placing each input in variable a
            while(true)
            {
                if(a==1)
                    break;
                else if((a&1)==0)
                {
                    a=a>>1;
                    count++;
                }
                else
                {
                    if(ispoweroftwo(a+1))
                    a=a+1;
                    else if(ispoweroftwo(a-1))
                        a=a-1;
                    else
                        a=a-1;
                    count++;
                }
            }
            result[i]=count;     // storing minimum replacements count in result array
        }
        return result;
    }
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int n_inputs,errors=0;
        n_inputs=sc.nextInt();//enter no of inputs
        int input[]=new int[n_inputs];
        int actualout[]=new int[n_inputs];
        int expectedout[]=new int[n_inputs];
        for(int i=0;i<n_inputs;i++)
        {
            input[i]=sc.nextInt();//enter inputs
        }
        for(int i=0;i<n_inputs;i++)
        {
            expectedout[i]=sc.nextInt();//enter expected outputs
        }
        actualout=min_replacements(input,n_inputs,actualout);//calling min_replacements method which returns output array
        for (int i=0; i<n_inputs; i++)
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


    }
}
