
public class 신고결과받기2 {

	public static void main(String[] args) {
//		String[] id_list = { "con", "ryan" };
//		String[] report = { "ryan con", "ryan con", "ryan con", "ryan con" };
//		int k = 3;

		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi frodo", "muzi neo", "apeach muzi",	"apeach muzi" };
		int k = 2;

		String[][] reportInfo = new String[report.length][2];
		String[][] resultInfo = new String[report.length][2];
		int[] answer = new int[id_list.length];

		int reportLen =0;
		
		for (int i = 0; i < report.length; i++) {
			for (int j = i + 1; j < report.length; j++) {
				if (report[j].equals(report[i])) {
					report[j] = ". .";
				}
			}
			if(!report[i].equals(". .")) {
				reportInfo[reportLen] = report[i].split(" ");
				reportLen++;
			}
		}

		System.out.println("reportLen : "+reportLen);
		
		int resultLen = 0;
		
		for (int i = 0; i < id_list.length; i++) {
			int count = 0;
			for (int j = 0; j < reportLen; j++) {
				if (id_list[i].equals(reportInfo[j][1])) {
					count++;
				}
			}
			if (count >= k) {
				for (int j = 0; j < reportLen; j++) {
					if (id_list[i].equals(reportInfo[j][1])) {
						resultInfo[resultLen] = reportInfo[j];
						resultLen++;
					}
				}
			}
		}
		
		System.out.println("resultLen : "+resultLen);
		for(int i=0;i<answer.length;i++) {
			for(int j =0;j<resultLen;j++) {
				if(id_list[i].equals(resultInfo[j][0])) {
					answer[i]++;
				}
			}
		}
		for(int i = 0;i<answer.length;i++) {
			System.out.println(answer[i]+" ");
		}
	}

}
