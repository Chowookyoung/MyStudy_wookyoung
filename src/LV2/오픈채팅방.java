package LV2;

import java.util.HashMap;

public class 오픈채팅방 {

	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		Solution sol = new Solution();
		String[] answer = sol.solution(record);
	}
}

class Solution{
	public String[] solution(String[] record) {
		String[] answer = {};
		HashMap<String,String> set = new HashMap<String,String>(record.length);
		for(String i : record) {
			
			
		}
		
		
		return answer;
	}
}
