package LV1;

public class ex04 {

	public static void main(String[] args) {

		int[] numbers = { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 };
		String hand = "left"; // "right"
		String answer = "";

		int[][] num = { { 4, 2 }, { 1, 1 }, { 1, 2 }, { 1, 3 }, { 2, 1 }, { 2, 2 }, { 2, 3 }, { 3, 1 }, { 3, 2 },
				{ 3, 3 } };
		int[] L = { 4, 1 };
		int[] R = { 4, 3 };

		for (int i = 0; i < numbers.length; i++) {
			int row = num[numbers[i]][0];
			int col = num[numbers[i]][1];

			int left = Math.abs(L[0] - row) + Math.abs(L[1] - col);
			int right = Math.abs(R[0] - row) + Math.abs(R[1] - col);

			if (col == 1) {
				answer += "L";
				L = num[numbers[i]];
			} else if (col == 3) {
				answer += "R";
				R = num[numbers[i]];
			} else {
				if (left < right) {
					answer += "L";
					L = num[numbers[i]];
				} else if (left > right) {
					answer += "R";
					R = num[numbers[i]];
				} else {
					if (hand.equals("left")) {
						answer += "L";
						L = num[numbers[i]];
					} else {
						answer += "R";
						R = num[numbers[i]];
					}
				}
			}

		}

		System.out.println(answer);

	}

}
