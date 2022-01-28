package LV1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};

		String answer = "";
		
		//정확성 성공, 효율성 실패
		for(String i:participant) {
			int j = 0;
			while(j<completion.length) {
				if(completion[j]!=null&&completion[j].equals(i)) {
					completion[j]=null;
					break;
				}
				j++;
			}
			if(j==completion.length)
				answer+=i;
		}
		
		//정확성 통과, 효율성 실패
//		ArrayList<String> parti = new ArrayList();
//		for(String i:participant) {
//			parti.add(i);
//		}
//		for(String i:completion) {
//			int j = 0;
//			while(j<parti.size()) {
//				if(parti.get(j).equals(i)) {
//					parti.remove(j);
//					break;
//				}
//				j++;
//			}
//		}
//		
//		String answer = parti.get(0);

//		for(String i:participant) {
//			answer+=(i);
//		}
//		
//		for(String i:completion) {
//			answer = answer.replaceFirst(i, "");
//		}
		
		System.out.println(answer);
		

	}

}
