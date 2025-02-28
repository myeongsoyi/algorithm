import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        int[] sum = new int[N];
        for(int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        if(N == 1) System.out.println(num[0]);
        else if(N == 2) System.out.println(num[0] + num[1]);
        else{
            sum[0] = num[0];
            sum[1] = num[0] + num[1];
            sum[2] = Math.max(sum[0] + num[2], num[1] + num[2]);
            sum[2] = Math.max(sum[2], sum[1]);
            for(int j = 3; j < N; j++) {
                sum[j] = Math.max(sum[j-2] + num[j], sum[j-3] + num[j-1] + num[j]);
                sum[j] = Math.max(sum[j], sum[j-1]);
            }
            System.out.println(sum[N-1]);
        }
    }
}