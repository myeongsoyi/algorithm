import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        List<Integer> list = new LinkedList<>();
        String[] nums = br.readLine().split(" ");
        for(String num : nums) list.add(Integer.parseInt(num));
        Collections.sort(list);
        System.out.println(list.get(K-1));
    }
}
