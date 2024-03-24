import java.util.HashSet;

class Solution {
    public static HashSet<Integer> set;
    public static boolean[] v;
    public static int solution(String numbers) {
        v = new boolean[numbers.length()];
        set = new HashSet<>();
        dfs (numbers, 0, 0);
        Integer[] value = set.toArray(new Integer[0]);
        int ans = 0;
        for(int i = 0; i < value.length; i++) if(prime(value[i])) ans++;
        return ans;
    }
    
    public static void dfs (String numbers, Integer num, int lev){
        for(int i = 0; i < numbers.length(); i++){
            if(!v[i]){
                v[i] = true;
                dfs(numbers, num*10 + numbers.charAt(i) - '0', lev +1);
                set.add(num*10 + numbers.charAt(i) - '0');
                v[i] = false;
            }
        }
    }
    
    public static boolean prime (Integer num){
        if(num < 2) return false;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num%i==0) return false;
        }
        return true;
    }
}