/*
    <a href="https://codeforces.com/problemset/problem/112/A"/>
*/
import java.util.Scanner;

public class PetyaString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s1 = in.next().toLowerCase();
        String s2 = in.next().toLowerCase();
        int n = s1.compareTo(s2);
        System.out.println(Integer.compare(n, 0));
        in.close();
    }
}
