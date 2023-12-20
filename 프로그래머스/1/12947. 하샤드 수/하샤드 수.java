class Solution {
    public boolean solution(int x) {
        int digit_total = 0;
        int tmp = x;
        for(int i = 10000; i > 0; i/=10) {
            digit_total += tmp/i;
            tmp %= i;
        }
        System.out.println(digit_total + " " + x);
        if(x%digit_total == 0) return true;
        else return false;
    }
}