import java.io.*;
import java.util.*;

public class Main {
    public static class Edge{
        int to;
        int weight;
        Edge(int to, int weight){
            this.to = to;
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        int V = Integer.parseInt(input1[0]); // 정점의 개수
        int E = Integer.parseInt(input1[1]); // 간선의 개수
        int K = Integer.parseInt(br.readLine())-1; // 시작 정점의 번호
        List<List<Edge>> graph = new ArrayList<>();
        for(int i = 0; i < V; i++) graph.add(new ArrayList<>());
        for(int i = 0; i < E; i++){
            String[] input2 = br.readLine().split(" ");
            int u = Integer.parseInt(input2[0])-1;
            int v = Integer.parseInt(input2[1])-1;
            int w = Integer.parseInt(input2[2]); // 가중치
            graph.get(u).add(new Edge(v, w));
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        boolean[] visit = new boolean[V];
        int[] distance = new int[V];
        Arrays.fill(distance, Integer.MAX_VALUE);
        pq.add(new int[]{0,K});
        distance[K] = 0;
        while(!pq.isEmpty()){
            int node = pq.poll()[1];
            if(visit[node]) continue;
            visit[node] = true;

            for(Edge edge: graph.get(node)){
                int to = edge.to;
                int weight = edge.weight;
                if(distance[to] > distance[node] + weight) {
                    distance[to] = distance[node] + weight;
                    pq.add(new int[]{distance[to], to});
                }
            }
        }
        for(int i = 0; i < V; i++) {
            if(distance[i] == Integer.MAX_VALUE) System.out.println("INF");
            else System.out.println(distance[i]);
        }
    }
}
