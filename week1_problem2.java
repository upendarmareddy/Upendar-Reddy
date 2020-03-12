import java.io.*;
import java.util.*;
public class week1_problem2 {
    public static int min_flips(int firstnum,int secnum,int result)
    {
        int count = 0,pos = 0,x,y,temp1=0;
        int temp = firstnum|secnum;             //Storing result of (firstnum | secnum) in temp
        while(temp1!=temp)
        {
            x=temp & (1<<pos);                  //Storing each bit of temp in x
            y=result & (1<<pos);                // Storing each bit of result in y

            if(x == y)                          // If the bits are equal then no flips required
            {

            }
            else if(x==0 && y>0)               //if temp bit is zero and result bit is not zero then only one bit is flipped at respective pos of firstnum or secnum so one flip is required
            {
                count++;
            }
            else
            {
                if((firstnum & (1<<pos))==(secnum & (1<<pos)))     // If result bit is zero and temp bit is not zero and
                {                                                  // if both the bits at respective pos of firstnum and secnum are zero
                                                                    // then both have to be flipped so two flips are required
                    count=count+2;
                }

                else                                     // else only one flip is required
                    count++;
            }
            pos++;                                       //traversing from LSB to MSB and checking both temp and result
            temp1 = temp1 | x;                           // adding ech bit of temp to temp1 so that if both are equal we come out of loop
        }
         return count;
    }
    public static void main(String args[])
    {
        int firstnum,secnum,result,actualout,expectedout;
        Scanner sc = new Scanner(System.in);
        firstnum = sc.nextInt();              //Enter first number
        secnum = sc.nextInt();                //Enter second number
        result = sc.nextInt();                //Enter expected result for (firstnum | secnum)
        expectedout = sc.nextInt();             //Enter expected output
        actualout = min_flips(firstnum,secnum,result);   //This method returns minimum flips required
        if(actualout==expectedout)
            System.out.println("Test case passed");
        else
            System.out.println("Error");

    }
}
