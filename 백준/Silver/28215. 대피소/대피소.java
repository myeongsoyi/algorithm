import java.io.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]); // 집의 개수
        int K = Integer.parseInt(input[1]); // 대피소의 개수
        Point[] house = new Point[N];
        for(int i = 0; i < N; i++){
            String[] coordinate = br.readLine().split(" ");
            int X = Integer.parseInt(coordinate[0]);
            int Y = Integer.parseInt(coordinate[1]);
            house[i] = new Point(X,Y);
        }
        int[][] distance = new int[N][N];
        for(int i = 0; i < N; i++){ // 여기가 대피소인 경우
            for(int j = 0; j < N; j++){ // 집에서 대피소까지의 거리
                distance[i][j] = Math.abs(house[i].x - house[j].x) + Math.abs(house[i].y - house[j].y);
            }
        }
        int ans = Integer.MAX_VALUE;
        int[] finalDistance = new int[N];
        if(K==1){ // 대피소가 한 개인 경우
            for(int i = 0; i < N; i++){ // 대피소
                int max = 0;
                for(int s = 0; s < N; s++) max = Math.max(max, distance[i][s]);
                ans = Math.min(ans, max);
            }
        }else if(K==2){ // 대피소가 두 개인 경우
            for(int i = 0; i < N; i++){ // 대피소 A
                for(int j = i+1; j < N; j++){ // 대피소 B
                    for(int s = 0; s < N; s++) finalDistance[s] = Math.min(distance[i][s], distance[j][s]);
                    int max = 0;
                    for(int s = 0; s < N; s++) max = Math.max(max, finalDistance[s]);
                    ans = Math.min(ans, max);
                }
            }
        }else if(K==3){ // 대피소가 세 개인 경우
            for(int i = 0; i < N; i++){ // 대피소 A
                for(int j = i+1; j < N; j++){ // 대피소 B
                    for(int k = j+1; k < N; k++){ // 대피소 C
                        for(int s = 0; s < N; s++) finalDistance[s] = Math.min(Math.min(distance[i][s], distance[j][s]), distance[k][s]);
                        int max = 0;
                        for(int s = 0; s < N; s++) max = Math.max(max, finalDistance[s]);
                        ans = Math.min(ans, max);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}