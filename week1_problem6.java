import java.io.*;
import java.util.*;
public class week1_problem6 {
    public static int single_element(int temp[])
    {
        for(int i=0;i<100000;i++)
        {
            if(temp[i]==1)         //if temp[i] is one then i is repeated only once
                return i;
        }
        return 0;
    }
    public static void main(String args[])
    {
        int temp[] = new int [100000];    //The temp array is initialized with all zeroes
        Scanner sc = new Scanner(System.in);
        int input,arrlength,expectout,actualout;
        arrlength=sc.nextInt();           //Enter the length of the array
        for(int i=0;i<arrlength;i++)
        {
            input=sc.nextInt();            //enter each element
            temp[input]=temp[input]+1;     //The value at an index of temp array is the number of times the index is repeated as input
        }
        expectout=sc.nextInt();
        actualout=single_element(temp);    //This method returns single element amon given inputs
        if(expectout==actualout)
            System.out.println("Test case passed");
        else
            System.out.println("Error");
    }
}
