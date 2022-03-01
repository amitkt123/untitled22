import java.util.Arrays;
import java.util.Scanner;
public class n_magicindex {
    public static void main(String[] args) {
        int size;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        //creating the even index PS Array
        int[] ps_even = new int[size];
        int[] ps_odd = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {

            if (i % 2 != 0)
                ps_even[i] = ps_even[i - 1];
            else {
                sum = sum + arr[i];
                ps_even[i] = sum;
            }}
            System.out.println(Arrays.toString(ps_even));
            //creating the odd indexed arrays
            ps_odd[0] = 0;
            int sum1 = 0;
            for(int i=1; i<size; i++) {

                if (i % 2 != 0) {
                    sum1 = sum1 + arr[i];
                    ps_odd[i] = sum1;
                }
                if (i % 2 == 0) {
                    ps_odd[i] = ps_odd[i - 1];
                }
            }
            System.out.println(Arrays.toString(ps_odd));



            for(int i=0; i<size; i++) {
                if(i==0){
                    int sum_even1 = ps_odd[size-1]- ps_odd[i];
                    int sum_odd1= ps_even[size-1]-ps_even[i];
                    if(sum_even1==sum_odd1)
                        count = count+1;
                }
                else
                {
                int sum_even = ps_even[i - 1] + ps_odd[size - 1] - ps_odd[i];
                //System.out.println(sum_even);
                int sum_odd = ps_odd[i - 1] + ps_even[size - 1] - ps_even[i];
                //System.out.println(sum_odd);
                if (sum_even == sum_odd)
                    count= count+1;
            }}
            System.out.println(count);

        }

}


