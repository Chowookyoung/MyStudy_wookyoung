package LV2;

import java.util.HashMap;

public class 오픈채팅방 {

	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		Solution sol = new Solution();
		String[] answer = sol.solution(record);
		for(String i : answer) {
			System.out.println(i);
		}
	}
}

class Solution{
	public String[] solution(String[] record) {
		
		HashMap<String,String> map = new HashMap<String,String>(record.length);
		int j =0;
		int len = 0;
		for(String i : record) {
			String[] re = i.split(" ");
			if(re.length==3) {
				map.put(re[1], re[2]);
				if(re[0].equals("Enter")) {
					len++;
				}
			}else {
				len++;
			}
			j++;
		}
		String[] answer = new String[len];
		j=0;
		for(String i : record) {
			String[] re = i.split(" ");
			if(re[0].equals("Enter")) {
				answer[j] = map.get(re[1])+"님이 들어왔습니다.";
				j++;
			}else if(re[0].equals("Leave")){
				answer[j] = map.get(re[1])+"님이 나갔습니다.";
				j++;
			}
		}
		
		return answer;
	}
}
