import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int N, count;
	    String S;
	    N = scanner.nextInt();
	    for(int test = 0; test < N; test++){
	        S = scanner.next();
	        count = 0;
	        for(int i = 0; i < S.length(); i++){
	            if(S.charAt(i)=='('){
	                count++;
	            }else{
	                count--;
	                if(count < 0){
	                    break;
	                }
	            }
	        }
	        if(count == 0){
	            System.out.println("YES");
	        }else{
	            System.out.println("NO");
	        }
	    }
	}
}