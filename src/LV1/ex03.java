package LV1;
import java.util.regex.Pattern;

public class ex03 {

	public static void main(String[] args) {

		String s = "one4seveneight";

		String[] arr = s.split("");
		for (int i = 0; i < s.length();) {
			if (Pattern.matches("^[a-z]*$", arr[i])) {

				switch (arr[i]) {
				case "z":
					arr[i] = "0";
					i += 4;
					break;
				case "o":
					arr[i] = "1";
					i += 3;
					break;
				case "t" :
					if(arr[i+1].equals("w")) {
						arr[i]="2";
						i+=3;
						break;
					}else {
						arr[i]="3";
						i+=5;
						break;
					}
				case "f" :
					if(arr[i+1].equals("o")) {
						arr[i]="4";
						i+=4;
						break;
					}else {
						arr[i]="5";
						i+=4;
						break;
					}
				case "s" :
					if(arr[i+1].equals("i")) {
						arr[i]="6";
						i+=3;
						break;
					}else {
						arr[i]="7";
						i+=5;
						break;
					}
				case "e" :
					arr[i] = "8";
					i += 5;
					break;
				case "n" :
					arr[i] = "9";
					i += 4;
					break;
				}
			}else {
				i++;
			}
		}
		
		s="";
		
		for(int i =0;i<arr.length;i++) {
			if (Pattern.matches("^[a-z]*$", arr[i])) {
				arr[i]="";
			}
			System.out.print(arr[i]);
			s+=arr[i];
		}
		
		int answer = Integer.parseInt(s);
		System.out.println(answer);

	}

}
