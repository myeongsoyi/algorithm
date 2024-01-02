class Solution {
    public static int solution(int[] arr) {
        int answer = arr[0];
        for(int i = 1; i < arr.length; i++){
            answer = gcd(answer, arr[i]);
        }
        return answer;
    }

    public static int gcd(int prev, int next){
        int answer = 0;
        for(int i = Integer.min(prev, next); i > 0; i--){
            if(prev%i == 0 && next%i == 0){
                answer = i * (prev/i) * (next/i);
                break;
            }
        }
        return answer;
    }
}