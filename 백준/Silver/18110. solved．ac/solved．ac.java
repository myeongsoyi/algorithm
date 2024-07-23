import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long ppl = Math.round((float)n*0.15);
        PriorityQueue<Integer> lev = new PriorityQueue<>();
        for(int opinion = 0; opinion < n; opinion++) lev.add(Integer.parseInt(br.readLine()));
        int total = 0;
        for(int index = 0; index < n; index++){
            if(index < ppl) lev.remove();
            else if(index >= n - ppl) break;
            else total += lev.remove();
        }
        System.out.println(Math.round((double)total / (n-2*ppl)));
    }
}