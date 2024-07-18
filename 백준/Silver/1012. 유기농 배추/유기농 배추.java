import java.io.*;

public class Main {

    public static int M;
    public static int N;
    public static boolean[][] field;
    public static boolean[][] bug;
    public static int ans;

    public static int[] dx = {0, -1, 0, 1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int test = 0; test < T; test++){
            String[] newCase = br.readLine().split(" ");
            M = Integer.parseInt(newCase[0]); //가로
            N = Integer.parseInt(newCase[1]); //세로
            int K = Integer.parseInt(newCase[2]); //배추 개수
            field = new boolean[M][N];
            ans = M*N;
            for(int cab = 0; cab < K; cab++){
                String[] place = br.readLine().split(" ");
                int a = Integer.parseInt(place[0]); //x좌표
                int b = Integer.parseInt(place[1]); //y좌표
                field[a][b] = true;
            }
            bug = new boolean[M][N];
            int count = 0;
            for(int i = 0; i < M; i++){
                for(int j = 0; j < N; j++){
                    if(field[i][j] && !bug[i][j]){
                        count++;
                        dfs(i, j);
                    }
                }
            }
            sb.append(count+"\n");
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void dfs(int x, int y){
        bug[x][y] = true;
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < M && ny >= 0 && ny < N && !bug[nx][ny] && field[nx][ny]) {
                dfs(nx, ny);
            }
        }
    }
}