import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        long[] ans = new long[101];
        ans[0] = 0;
        ans[1] = 1;
        ans[2] = 1;
        for(int i = 3; i < 101; i++) ans[i] = ans[i-2] + ans[i-3];
        for(int i = 0; i < T; i++){
            int c = Integer.parseInt(br.readLine());
            System.out.println(ans[c]);
        }
    }
}