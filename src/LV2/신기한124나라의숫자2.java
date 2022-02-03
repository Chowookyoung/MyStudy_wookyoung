package LV2;

import java.util.Scanner;

public class 신기한124나라의숫자2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Solution4 sol = new Solution4();
		System.out.println(sol.solution(n));

	}

}
class Solution4 {
    public String solution(int n) {
        String answer = "";
        
        String[] num124 = {"4","1","2"};
        
        while(n>0) {
        	answer = num124[n%3]+answer;
        	n = (n-1)/3;
        }
        
        return answer;
    }
}