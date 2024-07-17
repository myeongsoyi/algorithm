import java.io.*;

public class Main {
    public static int[][] dp = new int[30][30];

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 30;i++){
            dp[i][i] = 1;
            dp[i][0] = 1;
        }
        for(int i = 2; i < 30; i++){
            for(int j = 1; j <= i; j++){
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }
        int T = Integer.parseInt(br.readLine());
        for(int test = 0; test < T; test++){
            String[] newCase = br.readLine().split(" ");
            int N = Integer.parseInt(newCase[0]);
            int M = Integer.parseInt(newCase[1]);
            sb.append(dp[M][N]+"\n");
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}