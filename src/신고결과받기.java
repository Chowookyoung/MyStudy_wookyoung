
public class 신고결과받기 {

	public static void main(String[] args) {

		String[] id_list = { "con", "ryan" };
		String[] report = { "ryan con", "ryan con", "ryan con", "ryan con" };
		int k = 3;

//		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
//		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi frodo","muzi neo","apeach muzi","apeach muzi"};
//		int k = 2;

		int[] answer = new int[id_list.length];

		
		int usefulR = 0;
		String[][] reportInfo = new String[report.length][2];
		
		for (int i = 0; i < report.length; i++) {
			boolean check = true;
			for (int m = 0; m < i; m++) {
				if (report[i].equals(report[m])) {
					check = false;
				}
			}
			if(check) {
				reportInfo[usefulR] = report[i].split(" ");
				usefulR++;
			}
		}

		for (int i = 0; i < id_list.length; i++) {
			int count = 0;
			int l =0;
			while(l<usefulR) {
				if (reportInfo[l][1].equals(id_list[i])) {
					count++;
					if(count==k)
						break;
				}
				l++;
			}

			if (count >= k) {
				for (int j = 0; j < usefulR; j++) {
					if (reportInfo[j][1].equals(id_list[i])) {

						for (int m = 0; m < answer.length; m++) {
							if (reportInfo[j][0].equals(id_list[m])) {
								answer[m]++;
							}

						}
					}
				}
			}
		}

		
		System.out.println();
		System.out.print(answer[0]);
		for (int i = 1; i < answer.length; i++) {
			System.out.print(", " + answer[i]);
		}

	}

}
