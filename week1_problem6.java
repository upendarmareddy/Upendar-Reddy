import java.io.*;
import java.util.*;
public class week1_problem6 {
    public static int single_element(Map<Integer, Integer> temp)
    {
        for (Map.Entry<Integer, Integer> entry : temp.entrySet()) {
            if(entry.getValue()==1)             // if the value is 1 then the key is the single element
                return entry.getKey();
        }
        return 0;
    }
    public static void main(String args[])
    {
        Map<Integer,Integer> h=new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int input,arrlength,expectout,actualout;
        arrlength=sc.nextInt();           //Enter the length of the array
        for(int i=0;i<arrlength;i++)
        {
            input=sc.nextInt();             //enter each element
            if(h.get(input)==null)
            {
                h.put(input,1);
            }
            else
                h.put(input,2);//The value 2 at key of hashmap represents input/key  is repeated
        }
        expectout=sc.nextInt();// enter expected output
        actualout=single_element(h);//This method returns single element among given input
        if(expectout==actualout)
            System.out.println("Test case passed");
        else
            System.out.println("Error");
    }
}
