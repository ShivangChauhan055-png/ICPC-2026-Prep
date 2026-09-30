package Mock_1;

import java.util.Scanner;

public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long m = sc.nextLong();
            // brute force
//            long ans = 0;
//            for(long i=a+1;i<=b;i++){
//                long rem = i%m;
//                ans += rem;
//            }
//            System.out.println(ans);

            // optimized one we have to observe pattern and break it
            long ans = f(b,m)-f(a,m);
            System.out.println(ans);
        }
    }
    public static long f(long x,long y){
        long q = x/y; // complete one
        long r = x%y; // remaining one
        long fullsum = y*(y-1)/2;
        long remsum = r*(r+1)/2;
        return q*fullsum+remsum;
    }
}
