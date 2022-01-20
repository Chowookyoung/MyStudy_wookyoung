
public class ex01_solution {

	public static void main(String[] args) {

		String a = "...a¤±¤¤¤·.2^^!D.";
		String answer = "";
		String temp = a.toLowerCase();

		temp = temp.replaceAll("[^-_.a-z0-9]", "");
		System.out.println(temp);
		
		temp = temp.replaceAll("[.]{2,}", ".");
		temp = temp.replaceAll("^[.]|[.]$", "");
		System.out.println(temp.length());
		
		if (temp.equals(""))
			temp += "a";
		
		if (temp.length() >= 16) {
			temp = temp.substring(0, 15);
			temp = temp.replaceAll("^[.]|[.]$", "");
		}
		
		if (temp.length() <= 2)
			while (temp.length() < 3)
				temp += temp.charAt(temp.length() - 1);

		answer = temp;
		
		System.out.println(answer);

	}

}
