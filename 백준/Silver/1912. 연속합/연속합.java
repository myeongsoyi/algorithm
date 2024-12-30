import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int ans = Integer.parseInt(input[0]);
        int cur = ans;

        for(int i = 1; i < N; i++){
            int num = Integer.parseInt(input[i]);
            cur = Math.max(num, cur+num);
            ans = Math.max(cur, ans);
        }
        System.out.println(ans);
    }
}