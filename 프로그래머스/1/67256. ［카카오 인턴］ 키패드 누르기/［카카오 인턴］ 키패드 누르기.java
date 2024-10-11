class Solution {
    public static int[][] key = {{4,2},{1, 1},{1,2},{1,3},{2, 1},{2,2},{2,3},{3, 1},{3,2},{3,3},{4,1},{4,3}};
    
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int L = 10; // *
        int R = 11; // #
        boolean midL = false;
        boolean midR = false;
        for(int n : numbers){
            if(n == 1 || n == 4 || n == 7) {
                sb.append('L');
                L = n;
            }
            else if(n == 3 || n == 6 || n == 9) {
                sb.append('R');
                R = n;
            }
            else{ // 2, 5, 8, 0 (11)
                int Ld = Math.abs(key[n][0] - key[L][0]) + Math.abs(key[n][1]-key[L][1]);
                int Rd = Math.abs(key[n][0] - key[R][0]) + Math.abs(key[n][1]-key[R][1]);
                if(Ld < Rd){
                    sb.append('L');
                    L = n;
                }else if (Ld > Rd){
                    sb.append('R');
                    R = n;
                }else{
                    if(hand.equals("left")){
                        sb.append('L');
                        L = n;
                    }else{
                        sb.append('R');
                        R = n;
                    }
                }
            }
        }
        return sb.toString();
    }
}