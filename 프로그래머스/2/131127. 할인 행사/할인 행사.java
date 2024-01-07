class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        for(int start = 0; start <= discount.length - 10; start++){ // 시작 날짜
            int[] nums = new int[number.length];
            for(int day = start; day < start+10; day++){
                String today = discount[day];
                for(int i = 0; i < want.length; i++){
                    if(today.equals(want[i])) nums[i]++;
                }
            }
            boolean flag = true;
            for(int i= 0; i < nums.length; i++ )if(nums[i] != number[i]) flag = false;
            if(flag) answer++;
        }
        return answer;
    }
}