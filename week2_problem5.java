
import java.util.Scanner;
public class week2_problem5 {
    public static int mindiff = 10000;
    public static int max(int x,int y,int z)
    {
        if(x>y&&x>z)
            return x;
        else if(y>z)
            return y;
        else
            return z;
    }
    public static int min(int x,int y,int z)
    {
        if(x<y&&x<z)
            return x;
        else if(y<z)
            return y;
        else
            return z;
    }

    public static void mindifference(int a[],int b[], int c[],int last1,int last2,int last3)
    {
        int maximum,minimum,temp;
        maximum = max(a[last1],b[last2],c[last3]);
        minimum = min(a[last1],b[last2],c[last3]);
        temp = Math.abs(maximum - minimum);
        if(temp>mindiff)
            return;
        mindiff = temp;
        if(maximum == a[last1] && last1>0)
            mindifference(a,b,c,--last1,last2,last3);
       else if(maximum == b[last2] && last2>0)
            mindifference(a,b,c,last1,--last2,last3);
        else if(last3>0)
            mindifference(a,b,c,last1,last2,--last3);

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int len1,len2,len3;
        len1 = sc.nextInt();            //Enter first array length
        int a[] = new int[len1];
        for(int i=0;i<len1;i++)
            a[i] = sc.nextInt();         //Enter elements into first array
        len2 = sc.nextInt();             //Enter second array length
        int b[] = new int[len2];
        for(int i=0;i<len2;i++)
            b[i] = sc.nextInt();          //Enter elements into second array
        len3 = sc.nextInt();              //Enter third array length
        int c[] = new int[len3];
        for(int i=0;i<len3;i++)
            c[i] = sc.nextInt();           //Enter elements into third array
        mindifference(a,b,c,len1-1,len2-1,len3-1);
        System.out.println(mindiff);
    }
}
