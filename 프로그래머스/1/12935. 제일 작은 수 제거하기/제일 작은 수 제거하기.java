class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        else{
            int[] answer = new int[arr.length-1];
            int min_value = arr[0];
            for(int i = 1; i < arr.length; i++) if(arr[i] < min_value) min_value = arr[i];
            int index = 0;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == min_value) continue;
                answer[index++] = arr[i];
            }
            return answer;
        }
    }
}