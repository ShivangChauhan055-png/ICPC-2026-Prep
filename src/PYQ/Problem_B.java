package PYQ;

// B. Pseudo Palindrome

import java.util.*;

public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
//            int n  = sc.nextInt();
//            long d = sc.nextLong();
//            long[] a = new long[n];
//            for (int i = 0; i < n; i++) {
//                a[i] = sc.nextLong();
//            }
//            Arrays.sort(a);
//            boolean flag = true;
//            for(int i=0;i<n/2;i++){
//                if(a[n-1-i]-a[i]>d){
//                    flag = false;
//                    break;
//                }
//            }
//            System.out.println(flag ? "YES" : "NO");

            int n = sc.nextInt();
            int d = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            if (n % 2 == 0) {
                boolean ok = true;
                for (int i = 0; i < n; i += 2) {
                    if (a[i + 1] - a[i] > d) {
                        ok = false;
                        break;
                    }
                }
                System.out.println(ok ? "YES" : "NO");
            } else {
                boolean ok = false;
                for (int skip = 0; skip < n; skip++) {
                    boolean check = true;
                    int x = -1;
                    for (int i = 0; i < n; i++) {
                        if (i == skip) {
                            continue;
                        }
                        if (x == -1) {
                            x = a[i];
                        } else {
                            if (a[i] - x > d) {
                                check = false;
                                break;
                            }
                            x = -1;
                        }
                    }
                    if (check) {
                        ok = true;
                        break;
                    }
                }
                System.out.println(ok ? "YES" : "NO");
            }
        }
    }
}
