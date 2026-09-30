package Mock_1;

//A. Matching Socks
import java.util.Arrays;
import java.util.Scanner;

public class Problem_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] arr  = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            int idx = 0;
            long count = 0;
            //long maxi = 0;
            //if(n==1) System.out.println(0);
            while(idx<n){
                if(idx+1>=n) break;
                if(arr[idx]==arr[idx+1]){
                    count++;
                    idx+=2;
                    continue;
                }
                arr[idx]++;
                if(arr[idx]==arr[idx+1]){

                    count++;

                    idx+=2;
                    continue;
                }
                idx++;

            }
            System.out.println(count);


        }
    }
}
