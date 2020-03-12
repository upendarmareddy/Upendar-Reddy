import java.io.*;
import java.util.*;
public class week1_problem5 {
    public static int [] setbitcount(int n,int result[])
    {
        result[0]=0;
        for(int i=1;i<=n;i++)
        {
            result[i]=1+result[i & (i-1)];   // n & (n-1) clears 1 bit in n so  adding 1 and
        }                                    // the result of n & (n-1) is less than n which is already stored in the result array
                                             // so add  previous 1 to the result[n & (n-1)] and store in result[n]
        return result;
    }
    public static void  main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int input = sc.nextInt();            //Enter input number
       int errors=0;
       int actualout[] = new int[input+1];
       int expectout[] = new int[input+1];
        for(int i=0;i<=input;i++)
        {
            expectout[i]=sc.nextInt();      //Enter count of 1's of 0,1,2,........and so on up to n (including n)
        }
       actualout = setbitcount(input,actualout);   //This method returns array containing count of 1's of 0,1,2......and so on up to n (including n)

        for(int i=0;i<=input;i++)
        {
            if(actualout[i]!=expectout[i])
                errors++;
        }
        if(errors>0)
            System.out.println(errors+" Errors");
        else
            System.out.println("Test case passed");


    }
}
