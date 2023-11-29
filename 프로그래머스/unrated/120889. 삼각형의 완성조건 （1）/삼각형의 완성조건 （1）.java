class Solution {
    public int solution(int[] sides) {
        int max = 0;
        int total = 0;
        for(int i = 0; i < 3; i++){
            total += sides[i];
            max = Integer.max(max, sides[i]);
        }
        if(total > max*2) return 1;
        else return 2;
    }
}