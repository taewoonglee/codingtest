import java.util.Scanner;
public class sum_odd{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<10;j++)
            {
                int data=sc.nextInt();
                if(data%2==1)
                {
                    cnt=cnt+data;
                }
            }
            System.out.println("#"+(i+1)+" "+cnt);
            cnt=0;
        }

    }

}
