import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 0;
        for(int i = 0; i < N; i++){
            String word = br.readLine();
            int[] cnt = new int[26];
            char prev = word.charAt(0);
            cnt[prev-'a']++;
            for(int j = 1; j < word.length(); j++){
                char now = word.charAt(j);
                if(prev != now && cnt[now-'a'] != 0){
                    ans++;
                    break;
                }
                cnt[now-'a']++;
                prev = now;
            }
        }
        System.out.println(N-ans);
    }
}