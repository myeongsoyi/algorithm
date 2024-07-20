import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        Stack<Integer> list = new Stack<>();
        for(int num = 0; num < K; num++) {
            int cur = Integer.parseInt(br.readLine());
            if (cur == 0) list.pop();
            else list.add(cur);
        }
        int ans = 0;
        for(int l : list) ans += l;
        System.out.println(ans);
    }
}