import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] KN = br.readLine().split(" ");
        int K = Integer.parseInt(KN[0]);
        int N = Integer.parseInt(KN[1]);
        long[] LAN = new long[K];
        long max = 0;
        long min = 0;
        for(int i = 0; i < K; i++){
            LAN[i] = Integer.parseInt(br.readLine());
            max = max > LAN[i] ? max : LAN[i];
        }
        max++;
        while(min < max){
            int cnt = 0;
            long mid = (min+max)/2;
            for(int i = 0; i < K; i++) cnt += LAN[i]/mid;
            if(cnt < N) max = mid;
            else min = mid+1;
        }
        System.out.println(min-1);
    }
}