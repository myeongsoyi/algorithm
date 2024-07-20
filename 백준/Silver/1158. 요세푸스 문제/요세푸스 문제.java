import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        int N = Integer.parseInt(num[0]); // 참여 인원
        int K = Integer.parseInt(num[1]); // 규칙 인원

        int[] nums = new int[N];
        boolean[] vis = new boolean[N];
        for(int i = 0; i < N; i++) nums[i] = i+1;
        StringBuilder sb = new StringBuilder();
        int turn = -1; // 시작
        sb.append("<" );
        for(int i = 0; i < N; i++){ // 반복 횟수
            for(int j = 0; j < K; j++) {
                turn=(turn+1)%N;
                while(vis[turn]) turn=(turn+1)%N;
            }
            sb.append(nums[turn]);
            if(i != N-1) sb.append(", ");
            vis[turn] = true;
        }
        sb.append(">");
        System.out.println(sb);
    }
}