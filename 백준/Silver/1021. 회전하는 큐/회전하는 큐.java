import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] given = br.readLine().split(" ");
        int N = Integer.parseInt(given[0]);
        int M = Integer.parseInt(given[1]);
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 1; i <= N; i++) dq.add(i);
        String[] position = br.readLine().split(" ");
        int ans = 0;
        for(int t = 0; t < M; t++){
            int p = Integer.parseInt(position[t]);
            if(dq.peek() == p){
                dq.remove();
            }else{
                int l = left(dq, p);
                int r = right(dq, p);
                ans += l < r? l : r;
            }
        }
        System.out.println(ans);
    }

    public static int left(Deque<Integer> dq, int p){
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addAll(dq);
        int cnt = 0;
        while(deque.peek() != p){
            int tmp = deque.remove();
            deque.add(tmp);
            cnt++;
        }
        return cnt;
    }

    public static int right(Deque<Integer> dq, int p){
        int cnt = 0;
        while(dq.peek() != p){
            int tmp = dq.removeLast();
            dq.addFirst(tmp);
            cnt++;
        }
        dq.remove();
        return cnt;
    }
}