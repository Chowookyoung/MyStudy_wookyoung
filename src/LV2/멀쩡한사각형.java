package LV2;

import java.util.Scanner;

public class 멀쩡한사각형 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt();
		int h = sc.nextInt();
		Solution1 sol = new Solution1();
		System.out.println((w*h-sol.solution(w, h))+"  "+sol.solution(w, h));

	}

}
class Solution1 {
    public long solution(int w, int h) {
        long answer = 1;
        
        long min = Math.min(w, h);
        long max = Math.max(w, h);
        
        long gcd=min; //gcd = 최소 공배수;
        while(gcd>1) {
        	if(w%gcd==0&&h%gcd==0) {
        		break;
        	}
        	gcd--;
        }
        
        System.out.println(gcd);
        answer = w*h - (w+h-gcd);
        
        return answer;
    }
}