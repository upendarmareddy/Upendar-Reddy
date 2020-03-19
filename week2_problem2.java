import java.util.Scanner;

public class week2_problem2 {
    public static void build(int a[],int start,int end,int segtree[],int index)
    {
        int mid = (start+end)/2;
        if(start == end) {
            segtree[index] = a[start];
            return;
        }
        build(a,start,mid,segtree,2*index+1);
        build(a,mid+1,end,segtree,2*index+2);


        segtree[index] = segtree[2*index + 1] +segtree[2*index + 2];

    }
    public static void update(int segtree[],int start,int end,int updateindex,int diff,int index)
    {
        if(updateindex<start || updateindex > end )
            return;
        segtree[index] = segtree[index] + diff;
        if(end != start)
        {
            int mid = (start + end)/2;
            update(segtree,start,mid,updateindex,diff, 2*index+1);
            update(segtree,mid+1,end,updateindex,diff,2*index+2);

        }
    }
    public static int findsuminrange(int segtree[],int left,int right,int start,int end,int index)
    {
        int mid = (start + end)/2;
        if(left>end || right<start)
            return 0;
        if (left<=start && right>=end)
            return segtree[index];
        return findsuminrange(segtree,left,right,start,mid,2*index+1) + findsuminrange(segtree,left,right,mid + 1,end,2*index+2);

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arrlem = sc.nextInt();                      //Enter length of array
        int input[] = new int[arrlem];
        int segtree[] = new int[4*arrlem];
        int left,right,sum,updateindex,diff;
        for(int i=0;i<arrlem;i++)
            input[i] = sc.nextInt();                    //Enter array elements
        build(input,0,arrlem-1,segtree,0);
        updateindex = sc.nextInt();                     //Enter update index
        diff = input[updateindex];
        input[updateindex] = sc.nextInt();             //Enter new value
        diff = input[updateindex] - diff;
        update(segtree,0,arrlem-1,updateindex,diff,0);
        left = sc.nextInt();                          //Enter left of range
        right = sc.nextInt();                         //Enter right of range
        sum = findsuminrange(segtree,left,right,0,arrlem-1,0);
        System.out.println(sum);
    }
}
