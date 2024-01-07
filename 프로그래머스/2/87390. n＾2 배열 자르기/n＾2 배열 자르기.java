class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left)+1];
        int idx = 0;
        for(long i = left/n; i <= right/n; i++){
            for(int j = 0; j < n; j++){
                if((i == left/n && j <= left%n-1) || (i == right/n && j > right%n)) continue;
                if(i > j) answer[idx++] = (int) (i+1);
                else answer[idx++] = j+1;
            }
        }
        return answer;
    }
}