class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int n = arr1.length;
        int m = arr1[0].length;
        int l = arr2[0].length;
        int[][] answer = new int[n][l];
        for(int i = 0; i < n; i++){ // 행
            for(int j = 0; j < l; j++){ // 열
                int total = 0;
                for(int k = 0; k < m; k++) total += arr1[i][k] * arr2[k][j];
                answer[i][j] = total;
            }
        }
        return answer;
    }
}