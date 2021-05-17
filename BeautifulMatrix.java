/*
    <a href="https://codeforces.com/problemset/problem/263/A"/>
*/

import java.util.*;
public class BeautifulMatrix {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if(in.nextInt() == 1){
                    System.out.println(Math.abs(3-i) + Math.abs(3-j));
                }
            }
        }

        in.close();
    }
}
