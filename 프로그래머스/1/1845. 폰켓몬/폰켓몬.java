import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> phone = new HashMap<>();
        for(int i = 0; i < nums.length; i++) phone.put(nums[i], phone.getOrDefault(nums[i]+1,1));
        if(phone.size() >= nums.length/2) return nums.length/2;
        else return  phone.size();
    }
}