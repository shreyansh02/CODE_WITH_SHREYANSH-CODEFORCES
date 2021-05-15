/*
    <a href="https://codeforces.com/problemset/problem/231/A"/>
 */

import java.util.*;

public class Team {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n,a,b,c;
        int cnt=0;
        n = sc.nextInt();
        for(int i=1; i<=n; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if((a+b+c)>=2){
                cnt = ++cnt;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
