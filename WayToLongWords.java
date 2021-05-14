/*
    <a href="https://codeforces.com/problemset/problem/71/A"/>
*/

import java.util.Scanner;

public class WayToLongWords {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<=n; i++) {
            String in = sc.nextLine();
            if(in.length()>10){
                System.out.print(in.charAt(0));
                System.out.print(in.length()-2);
                System.out.print(in.charAt(in.length()-1));
            } else {
                System.out.println(in);
            }
        }
        sc.close();
    }
}
