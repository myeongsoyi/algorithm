import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%divisor==0) answer.add(arr[i]);
        }
        if(answer.size() == 0) return new int[]{-1};
        else {
            Collections.sort(answer);
            int[] ans = new int[answer.size()];
            for(int i = 0; i < answer.size(); i++) ans[i] = answer.get(i);
            return ans;
        }
    }
}