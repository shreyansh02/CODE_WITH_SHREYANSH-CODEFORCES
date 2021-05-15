/*
    <a href="https://codeforces.com/problemset/problem/158/A"/>
*/

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int cnt = 0;
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        int key = a[k-1];

        for(int j=0;j<n;j++) {
            if(a[j]>=key && a[j]>0) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}
