class Solution {
    public static int ans;
    public static boolean[] vis;
    public static int solution(int n, int[][] com){
        ans = 0;
        vis = new  boolean[n];
        for(int i = 0; i < n; i++){
            if(!vis[i]){
                ans++;
                dfs(i, com);
            }
        }
        return ans;
    }

    public static void dfs(int i, int[][] com){
        vis[i] = true;
        for(int j = 0; j < com.length; j++){
            if(vis[j] | com[i][j] == 0) continue;
            dfs(j, com);
        }
    }
}