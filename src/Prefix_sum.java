import java.util.Arrays;
import java.util.Scanner;
public class Prefix_sum {
    public static void main(String[] args)
    {
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum =0;
        int[] prefix_sum= new int[size];
        for(int i=0; i<size; i++)
        {
            sum= sum+arr[i];
            prefix_sum[i]= sum;
        }
        System.out.println(Arrays.toString(prefix_sum));
        System.out.println("enter the indices to calculate the sum between"+ "Start");
        int start = sc.nextInt();
        System.out.println("enter the indices to calculate the sum between"+ "Start");
        int end = sc.nextInt();
        if(start ==0)
            System.out.println(prefix_sum[end]);
        else{
        int sums = prefix_sum[end]- prefix_sum[start-1];
        System.out.println(sums);}
    }
}
