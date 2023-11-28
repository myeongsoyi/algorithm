class Solution {
    public int[] solution(int[] arr, int k) {
        int len = arr.length;
        int[] answer = new int[len];
        for(int i = 0; i < len; i++){
            if(k%2==0){
                answer[i] = arr[i]+k;
            }else{
                answer[i] = arr[i]*k;
            }
        }
        return answer;
    }
}