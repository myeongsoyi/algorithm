import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] scores = new int[n];
        for(int i = 0; i < n; i++) scores[i] = Integer.parseInt(br.readLine());
        if(n == 1) System.out.println(scores[0]);
        else if(n == 2) System.out.println(scores[0] + scores[1]);
        else{
            int[] dp = new int[n];
            dp[n-1] = scores[n-1];
            dp[n-2] = scores[n-1] + scores[n-2];
            dp[n-3] = scores[n-1] + scores[n-3];
            for(int i = n-4; i >= 0; i--){
                dp[i] = Integer.max(scores[i] + scores[i+1]+ dp[i+3], scores[i] + dp[i+2]);
            }
            System.out.println(Integer.max(dp[0], dp[1]));
        }
    }
}