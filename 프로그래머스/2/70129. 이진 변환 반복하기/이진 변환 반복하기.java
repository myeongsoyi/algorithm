class Solution {
    public int[] solution(String s) {
        int transformCnt = 0;
        int deleteCnt = 0;
        while(!s.equals("1")){
            int len = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i)=='0') deleteCnt++;
                else len++;
            }
            transformCnt++;
            s = Integer.toBinaryString(len);
        }
        return new int[] {transformCnt, deleteCnt};
    }
}