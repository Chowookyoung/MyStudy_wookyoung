package LV2;

import java.util.Scanner;

public class 신기한124나라의숫자 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Solution3 sol = new Solution3();
		System.out.println(sol.solution(n));
		
	}

}
class Solution3 {
    public String solution(int n) {
        String answer = "";
        
        int k=0;
        
        int min = (int)Math.pow(3, k);
        int max = (int)Math.pow(3, k+1);
        
        while(true) {
        	if(min<=n&&n<=max) {
        		break;
        	}
        	min = max+1;
        	max = max + (int)Math.pow(3,k+2);
        	k++;
        }
        
        //k+1자리수
        
        while(k>=0) {
        	int pow = (int)Math.pow(3, k);
        	String num = "";
        	if(min<=n&&n<=min+pow-1) {
        		num="1";
        		max = min+pow-1;
        	}else if(min+pow<=n&&n<=max-pow) {
        		num="2";
        		min = min+pow;
        		max = max-pow;
        	}else {
        		num="4";
        		min = max-pow+1;
        	}
        	answer+=num;
        	k--;
        }
        
        return answer;
    }
}