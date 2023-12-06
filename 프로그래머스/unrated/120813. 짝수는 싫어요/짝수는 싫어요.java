class Solution {
    public int[] solution(int n) {
        if(n%2==0){
            int[] answer = new int[n/2];
            for(int i = 0; i < n/2; i++){
                answer[i] = 2*i + 1;
            }
            return answer;
        }else{
            int[] answer = new int[n/2+1];
            for(int i = 0; i < n/2+1; i++){
                answer[i] = 2*i + 1;
            }
            return answer;
        }
        
    }
}