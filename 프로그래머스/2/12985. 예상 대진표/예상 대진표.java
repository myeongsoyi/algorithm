class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        boolean[] game = new boolean[n];
        game[a-1] = true;
        game[b-1] = true;
        while(game.length != 1){
            boolean[] nextRound = new boolean[game.length/2];
            for(int i = 0; i < game.length; i += 2){
                if(game[i] && game[i+1]) return answer;
                else if(game[i] || game[i+1]) nextRound[i/2] = true;
            }
            game = nextRound;
            answer++;
        }
        return answer;
    }
}