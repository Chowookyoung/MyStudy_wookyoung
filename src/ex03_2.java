
public class ex03_2 {

	public static void main(String[] args) {

		String s = "one4seveneight";
		int answer = 0;
		
		String[] number = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		for (int i = 0; i < 10; i++) {
			s = s.replaceAll(number[i], Integer.toString(i));
		}
		
		answer = Integer.parseInt(s);
		
		System.out.println(answer);

	}

}
