import java.util.Arrays;
import java.util.Scanner;

public class CentralTendency
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        double mean,median;
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
            sum+=array[i];
        }
        mean=(double) sum/n;
        System.out.printf("%.2f\n",mean);
        Arrays.sort(array);
        if(n%2==0)
            median=(double) (array[n/2]+array[n/2+1])/2;
        else
            median=array[n/2];
        System.out.printf("%.2f\n",median);
        int number=array[0],count=1,maxCount=0;
        double mode=array[0];
        for(int i=1;i<n;i++)
        {
            if(array[i]==mode) {
                count += 1;
            }
            else
            {
                if(maxCount<count)
                {
                    maxCount=count;
                    mode=number;
                }
                count=1;
                number=array[i];

            }
        }
        System.out.printf("%.2f\n",mode);
    }
}
