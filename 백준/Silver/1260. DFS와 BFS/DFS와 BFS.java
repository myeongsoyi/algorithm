import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int M;
    public static int V;
    public static boolean[][] board;

    public static StringBuilder sb;

    public static void main(String[] args) throws IOException{
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]); // 정점의 개수
        M = Integer.parseInt(input[1]); // 간선의 개수 (양방향)
        V = Integer.parseInt(input[2]); // 탐색을 시작할 정점의 번호
        board = new boolean[N+1][N+1];
        for(int i = 0; i < M; i++){
            String[] edge = br.readLine().split(" ");
            int A = Integer.parseInt(edge[0]);
            int B = Integer.parseInt(edge[1]);
            board[A][B] = true;
            board[B][A] = true;
        }
        sb = new StringBuilder();
        // 계산
        dfs(V, new boolean[N+1]);
        sb.append("\n");
        bfs(V, new boolean[N+1]);
        // 출력
        System.out.println(sb.toString());
    }

    public static void bfs(int v, boolean[] vis){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        vis[v] = true;
        while(!queue.isEmpty()){
            int n = queue.remove();
            sb.append(n + " ");
            for(int i = 1; i <= N; i++){
                if(board[n][i] && !vis[i]) {
                    queue.add(i);
                    vis[i] = true;
                }
            }
        }
    }

    public static void dfs(int v, boolean[] vis){
         vis[v] = true;
         sb.append(v + " ");
         for(int i = 1; i <= N; i++){
             if(!vis[i] && board[v][i]) dfs(i, vis);
         }
    }
}