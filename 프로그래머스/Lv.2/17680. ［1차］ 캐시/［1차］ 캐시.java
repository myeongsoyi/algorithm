import java.util.LinkedList;
import java.util.List;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> cache = new LinkedList<>();
        for(String city : cities){
            city = city.toLowerCase();
            if(cache.contains(city)){
                answer += 1;
                cache.remove(city);
                cache.add(city);
            }else {
                if(cacheSize != 0) {
                    if (cache.size() < cacheSize) cache.add(city);
                    else {
                        cache.remove(0);
                        cache.add(city);
                    }
                }
                answer += 5;
            }
        }
        return answer;
    }
}