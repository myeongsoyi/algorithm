import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] ans = new int[N+1];
        ans[1] = 0;
        for(int i = 2; i <= N; i++){
            if(i%2==0 && i%3==0){
                ans[i] = Math.min(ans[i/3]+1, Math.min(ans[i/2]+1, ans[i-1]+1));
            }else if(i%3==0){
                ans[i] = Math.min(ans[i/3]+1, ans[i-1]+1);
            }else if(i%2==0){
                ans[i] = Math.min(ans[i/2]+1, ans[i-1]+1);
            }else{
                ans[i] = ans[i-1]+1;
            }
        }
        System.out.println(ans[N]);
    }
}