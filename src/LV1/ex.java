package LV1;
public class ex {

	public static void main(String[] args) {
		
		String a = "=.=";
		char[] answerArr = a.toLowerCase().toCharArray();

		for (int i = 0; i < answerArr.length; i++) {
			if (answerArr[i] < 48 || (answerArr[i] > 57 && answerArr[i] < 97) || answerArr[i] > 122) {
				if (answerArr[i] != '-' && answerArr[i] != '_' &&  answerArr[i] != '.') {
					answerArr[i] = 32;
				}
			}
		}

		String answer = String.valueOf(answerArr).replaceAll(" ", "");
		answerArr = answer.toCharArray();

		for (int i = 0, count = 0; i < answerArr.length; i++) {
			if (answerArr[i] == '.') {
				count++;
			} else {
				count = 0;
			}
			if (count > 1) {
				answerArr[i] = 32;
			}
		}

		answer = String.valueOf(answerArr).replaceAll(" ", "");
		answerArr = answer.toCharArray();

        if (answer.charAt(0) == '.')
			answer = answer.substring(1);

		if (answer.length() >= 1 && answer.charAt(answer.length() - 1) == '.')
			answer = answer.substring(0, answer.length() - 1);
			
		if (answer.length() < 1) {
			answer = "aaa";
		} else if (answer.length() >= 16) {
			answer = answer.substring(0, 15);
			if (answer.substring(14).equals(".")) {
				answer = answer.substring(0, 14);
			}
		} else if (answer.length() <= 2) {
			while (answer.length() < 3) {
				answer = answer + answer.substring(answer.length() - 1);
			}
		}

		System.out.println(answer);
	}

}
