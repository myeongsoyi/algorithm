import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int K;
    public static int[] time;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]); // 수빈이의 위치
        K = Integer.parseInt(input[1]); // 동생의 위치
        time = new int[100001];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);
        time[N] = 1;
        int ans = -1;
        while(!queue.isEmpty()){
            int n = queue.remove();
            if(n == K) {
                ans = time[n]-1;
                break;
            }
            if(n-1>=0 && time[n-1] == 0){
                time[n-1] = time[n]+1;
                queue.add(n-1);
            }
            if(n+1<=100000 && time[n+1] == 0){
                time[n+1] = time[n]+1;
                queue.add(n+1);
            }
            if(2*n<=100000 && time[2*n] == 0){
                time[2*n] = time[n]+1;
                queue.add(2*n);
            }
        }
        System.out.println(ans);
    }
}
