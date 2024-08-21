import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] is2friend = new int[N][N];

        for(int i = 0; i < N; i++) { // A
            String tmp = br.readLine();
            for(int j = 0; j < N; j++) {
                if(i == j) is2friend[i][j] = 0;
                if(tmp.charAt(j) == 'Y') is2friend[i][j] = 1;
                else is2friend[i][j] = 100;
            }
        }

        for(int b = 0; b < N; b++) {
            for(int a = 0; a < N; a++) {
                for(int c = 0; c < N; c++) {
                    if(a == c) continue;
                    is2friend[a][c] = Math.min(is2friend[a][c], is2friend[a][b] + is2friend[b][c]);
                }
            }
        }

        int ans = 0;
        for(int i = 0; i < N; i++){
            int tmp = 0;
            for(int j = 0; j < N; j++){
                if(is2friend[i][j] == 1 || is2friend[i][j] == 2) tmp++;
            }
            ans = Math.max(ans, tmp);
        }
        System.out.println(ans);
    }
}