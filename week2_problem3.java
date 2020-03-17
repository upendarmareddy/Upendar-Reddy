import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class week2_problem3 {
    public static int frequency(HashMap<Integer,Integer> h, int key)
    {
        if(h.containsKey(key))
            return h.get(key);
        else
            return 0;
    }
    public static void main(String args[])
    {
        HashMap<Integer,Integer> h=new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int input,arrlength,expectout,actualout,key,i,j;
        arrlength=sc.nextInt();                      //Enter the length of the array
        for(i=0;i<arrlength;i++)
        {
            input=sc.nextInt();             //enter each element
            if(h.get(input)==null)          // if the input is not present as key in hashmap value is 1
            {
                h.put(input,1);
            }
            else{
                h.put(input,(h.get(input)+1));     // the value at input/key is incremented if the input is repeated
            }

        }
        key = sc.nextInt();                              //Enter the key whose frequency is to be known
        expectout=sc.nextInt();                         // enter expected output
        actualout=frequency(h,key);                     //This method returns frequency of given array
        if(expectout==actualout)
            System.out.println("Test case passed");
        else
            System.out.println("Error");
    }
}
