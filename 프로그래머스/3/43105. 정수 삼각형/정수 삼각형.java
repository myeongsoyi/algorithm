class Solution {
    public static int solution(int[][] triangle) {
        for(int i = 1; i < triangle.length; i++){
            for(int j = 0; j < triangle[i].length; j++){
                int k = triangle[i-1].length;
                triangle[i][j] = Math.max(j-1>=0?triangle[i-1][j-1] + triangle[i][j] : triangle[i][j],
                        j<k?triangle[i-1][j] + triangle[i][j] : triangle[i][j]);
            }
        }
        int answer = 0;
        for(int i = 0; i < triangle[triangle.length-1].length; i++) answer = Math.max(answer, triangle[triangle.length-1][i]);
        return answer;
    }
}