import java.io.*;
import java.util.*;
public class week1_problem6 {
    public static int single_element(int arr[],int n)
    {
        int element=0;
        for(int i=0;i<n;i++)
            element = element ^ arr[i];     //The XOR on twice repeated values is 0 and at the end of loop single element is stored in element
        return element;
    }
    public static void main(String args[])
    {
        Map<Integer,Integer> h=new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int input,arrlength,expectout,actualout,i,j;
        arrlength=sc.nextInt();//Enter the length of the array
        int inputarr [] = new int[arrlength];
        for(i=0,j=0;i<arrlength;i++)
        {
            input=sc.nextInt();             //enter each element
            if(h.get(input)==null)          // if the input is not present as key in hashmap value is 1
            {
                h.put(input,1);
                inputarr[j++]=input;         //adding input to input array
            }
            else{
                h.put(input,(h.get(input)+1));     // the value at input/key is incremented if the input is repeated
            }
            if(h.get(input)==3)                    //The value 3 at key of hashmap represents input/key  is repeated 3 times
            {
                inputarr[j++] = input;             //here input is repeated only twice in the array
            }

        }
        expectout=sc.nextInt();// enter expected output
        actualout=single_element(inputarr,j);//This method returns single element among inputarr
        if(expectout==actualout)
            System.out.println("Test case passed");
        else
            System.out.println("Error");
    }
}
