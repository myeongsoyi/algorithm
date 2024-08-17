import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int L = Integer.parseInt(input[1]);
        while(true){
            int min = (N/L) - (L-1)/2;
            if(L > 100 || min < 0){
                System.out.println("-1");
                break;
            }
            int sum = (min*2+L-1)*L/2;
            if(sum == N){
                for(int i = 0; i < L; i++) System.out.print(min+i+" ");
                break;
            }
            L++;
        }
    }
}