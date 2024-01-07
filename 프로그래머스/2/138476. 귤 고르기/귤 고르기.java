import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> tan = new HashMap<>();
        for(int t : tangerine) tan.put(t, tan.getOrDefault(t, 0) + 1);
        ArrayList<Integer> nums = new ArrayList<>(tan.values());
        Collections.sort(nums, Collections.reverseOrder());
        int sum = 0;
        int answer = 0;
        for(int n : nums){
            answer++;
            if(sum+n >= k)break;
            else sum += n;
        }
        return answer;
    }
}