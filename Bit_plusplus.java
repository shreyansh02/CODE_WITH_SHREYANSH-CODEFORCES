/*
    <a href="https://codeforces.com/problemset/problem/282/A"/>
*/
import java.util.Scanner;

public class Bit_plusplus {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n, cnt=0;
        n = in.nextInt();
        for(int i=0; i<=n; i++){
            String X = in.nextLine();
            if(X.equals("++X") || X.equals("X++"))
                cnt = ++cnt;
            else if(X.equals("--X") || X.equals("X--"))
                cnt = --cnt;
        }
        System.out.println(cnt);
        in.close();
    }
}
