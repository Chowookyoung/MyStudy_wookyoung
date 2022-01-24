package LV1;

public class 음양더하기 {

	public static void main(String[] args) {
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		
		int answer = 0;
		
		for(int i=0;i<signs.length;i++) {
			if(signs[i]) answer+=absolutes[i];
			else answer-=absolutes[i];
		}
		
		
		System.out.println(answer);
	}

}
