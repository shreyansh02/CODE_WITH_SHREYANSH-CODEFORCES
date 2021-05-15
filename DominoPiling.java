/*
    <a href="https://codeforces.com/problemset/problem/50/A"/>
*/

import java.util.*;

public class DominoPiling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        float m1 = 1, n1 = 2;
        float x = m/m1, y = n/n1;
        int z = (int) (x *y);
        System.out.println(z);

        sc.close();
    }
}
