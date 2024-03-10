class Solution {
    public static int answer;
    public static int solution(int[] numbers, int target) {
        answer = 0;
        dfs(numbers, target, 0, 0);
        return answer;
    }
    public static void dfs(int[] numbers, int target, int level, int total){
        if(level == numbers.length){
            if(total == target) answer++;
            return;
        }
        dfs(numbers, target, level+1, total+numbers[level]);
        dfs(numbers, target, level+1, total-numbers[level]);
    }
}