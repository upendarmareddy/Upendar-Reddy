import java.util.*;

public class week2_problem6 {
    public static int median(int a[],int b[],int n1,int n2)
    {
        int i=0,j=0,k=0,n;
        n = n1+n2;
        int newarr[] = new int[n1+n2];
        while(i<n1 && j<n2)
        {
            if(a[i]<b[j])
                newarr[k++] = a[i++];
            else
                newarr[k++] = b[j++];
        }
        while(i<n1)
            newarr[k++] = a[i++];
        while (j<n2)
            newarr[k++] = b[j++];
        if((n&1)==0)
            return (newarr[n/2] + newarr[n/2-1])/2;
        else
            return newarr[n/2];
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr1len,arr2len,actualout,expectedout;
        arr1len = sc.nextInt();
        arr2len = sc.nextInt();  //Enter array length
        int inputarr1[] = new int[arr1len];
        int inputarr2[] = new int[arr2len];
        for(int i=0;i<arr1len;i++)
            inputarr1[i] = sc.nextInt();
        for(int i=0;i<arr2len;i++)
            inputarr2[i] = sc.nextInt();//Enter array elements
        actualout = median(inputarr1,inputarr2,arr1len,arr2len);         //This method returns first missing letter in sequence
        expectedout = sc.nextInt();                    //Enter expected output
        if(expectedout == actualout)
            System.out.println("Test case passed");
        else
            System.out.println("Error");
    }
}
