class Solution {
    public String solution(String s) {
        String[] nums = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(String num : nums){
            int numCheck = Integer.parseInt(num);
            if(min > numCheck) min = numCheck;
            if(max < numCheck) max = numCheck;
        }
        return min + " " + max;
    }
}