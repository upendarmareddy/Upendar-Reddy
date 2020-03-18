import java.io.*;
import java.util.*;

public class week2_problem1 {
    public static int input,count=0;
    public static void balancedparanthesis(int n)
    {
        if(n==2)
            return;
        else {
            balancedparanthesis(n-2);
            count++;
            balancedparanthesis(n-2);
            count++;

        }

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        balancedparanthesis(input);
        System.out.println(count);
    }
}
