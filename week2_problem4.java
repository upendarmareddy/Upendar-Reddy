import java.io.*;
import java.util.*;
public class week2_problem4 {
    public static int missing = 0;
    public static boolean issequence(int a[],int low,int high)     // This method returns true if the elements of array a are in sequence
    {
        if(a[low] + high - low == a[high] )
            return true;
        else
            return false;

    }
    public static int firstmissingelement(int a[],int low, int high)  //Binary Search algorithm is used
    {
        int mid=(low+high)/2;
        if(a[mid]+1!=a[mid+1])                      //if middle position element is not equal to middle + 1 position element missing is midddle position element + 1
            missing = a[mid]+1;
        if(!issequence(a,low,mid))                  //If low to middle is not in sequence then recursively call firstmissingelement on low to middle
            missing = firstmissingelement(a,0,mid);
        else if(!issequence(a,mid+1,high))        // else if middle to high is not in sequence then recursively call firstmissingelement on mid + 1 to high
              missing = firstmissingelement(a,mid+1,high);
        return missing;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arrlen,actualout,expectedout;
        arrlen = sc.nextInt();                        //Enter array length
        int inputarr[] = new int[arrlen];
        for(int i=0;i<arrlen;i++)
            inputarr[i] = sc.nextInt();               //Enter array elements
        actualout = firstmissingelement(inputarr,0,arrlen-1);         //This method returns first missing letter in sequence
        expectedout = sc.nextInt();                    //Enter expected output
        if(expectedout == actualout)
            System.out.println("Test case passed");
        else
            System.out.println("Error");
    }
}
