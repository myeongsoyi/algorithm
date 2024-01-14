class Solution {
    public int solution(int[] priorities, int location) {
        boolean[] used = new boolean[priorities.length];
        int answer = 1;
        int start = 0;
        int len = priorities.length;
        while(len > 0){
            if (used[start]) continue;
            int pin = start;
            for (int next = start + 1; next < start + priorities.length - 1; next++) {
                if (priorities[next % priorities.length] > priorities[pin % priorities.length] && !used[next % priorities.length]) {
                    pin = next % priorities.length;
                }
            }
            if (pin == location) return answer;
            answer++;
            used[pin % priorities.length] = true;
            while(used[(pin+1)%priorities.length])pin++;
            start = (pin + 1)%priorities.length;
            len--;
        }
        return answer;
    }
}