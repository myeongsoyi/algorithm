class Solution {
    public int solution(int[] num_list) {
        int total_mul = 1;
        int total_sum = 0;
        for(int n : num_list){
            total_mul *= n;
            total_sum += n;
        }
        if(total_mul < Math.pow(total_sum,2)) return 1;
        else return 0;
    }
}