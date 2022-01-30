package LV2;

import java.util.ArrayList;

public class ex01 {

	public static void main(String[] args) {
		
		String s = "abeabeeeeaaaeaff";
		
		String answerStr = "";
		int answer = s.length();
		
		for(int i =1;i<s.length();i++) {
			ArrayList<String> array = new ArrayList<String>();
			
			String str = s;
			
			while(str.length()>i) {
				array.add(str.substring(0,i));
				str = str.substring(i);
			}
			array.add(str);

			int count = 1;
			for(int j=1;j<=array.size();j++) {
				if(j<array.size()) {
					if(array.get(j).equals(array.get(j-1))) {
						count++;
						array.set(j-1, "");
					}else if(count!=1) {
						array.set(j-count, count+"");
						count = 1;
					}
				}else if(count!=1){
					array.set(j-count, count+"");
				}
			}
			answerStr = String.join("", array);
			if(answerStr.length()<answer)
				answer = answerStr.length();
		}
		
		System.out.println(answer);

	}

}
