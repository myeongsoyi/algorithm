class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        for(int i = (int) Math.sqrt(total); i >= 1; i--){
            if(total % i == 0 && 2*(i + total/i) == brown+4){
                answer[1] = i;
                answer[0] = total/i;
                break;
            }
        }
        return answer;
    }
}