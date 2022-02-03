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
        
//        if(max%min==0) {
//        	//둘 중 하나의 수가 다른 수의 배수일때
//        	answer = w*h - max;
//        }else if(min%2!=0||max%2!=0) {
//        	//둘 중 하나라도 홀 수 일때
//        	answer = w*h - (min + max - 1);
//        }else if(min%2==0&&max%2==0) {
//        	//둘 다 짝수일때
//        	answer = (w*h) - (min*2);
//        }else {
        long gcd=min;
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