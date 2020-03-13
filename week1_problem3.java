import java.io.*;
import java.util.*;

public class week1_problem3 {
    public static int findmaxXOR(int[] nums) {
        int max = 0, mask = 0;
        for(int i = 8; i >= 0; i--){
            mask = mask | (1 << i);
            Set<Integer> set = new HashSet<>();
            for(int num : nums){
                set.add(num & mask);
            }
            int tmp = max | (1 << i);
            for (int prefix : set) {
                if (set.contains(tmp ^ prefix)) {
                    max = tmp;
                    break;
                }
            }
        }
        return max;
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arrlength,actualout,expectout;
        arrlength = sc.nextInt();
        int input[] = new int[arrlength];
        for(int i=0;i<arrlength;i++)
            input[i] = sc.nextInt();
        expectout = sc.nextInt();
        actualout = findmaxXOR(input);
        if(actualout == expectout)
            System.out.println("Test case passed");
        else
            System.out.println("Error");

    }
}
