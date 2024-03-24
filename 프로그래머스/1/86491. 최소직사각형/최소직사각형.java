import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int width = Integer.MIN_VALUE;
        int hight = Integer.MIN_VALUE;
        for(int i = 0; i < sizes.length; i++){
            Arrays.sort(sizes[i]);
            width = Math.max(sizes[i][0], width);
            hight = Math.max(sizes[i][1], hight);
        }
        System.out.println(width + " " + hight);
        return width*hight;
    }
}