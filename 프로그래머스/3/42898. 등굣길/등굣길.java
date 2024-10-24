class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int mod = 1_000_000_007;
        int[][] map = new int[m][n];
        for(int[] pud: puddles) map[pud[0]-1][pud[1]-1] = -1;
        map[0][0] = 1;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 && j == 0) continue;
                if(map[i][j] == -1) {
                    map[i][j] = 0;
                    continue;
                }
                if(i > 0) map[i][j] += map[i-1][j]%mod;
                if(j > 0) map[i][j] += map[i][j-1]%mod;
            }
        }
        return map[m-1][n-1]%mod;
    }
}