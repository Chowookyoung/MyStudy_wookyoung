package LV2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ex01_2 {

	public static void main(String[] args) {

		String s = "aabbaccc";
		
		int answer = s.length();
		
		for(int i =1;i<s.length();i++) {
			int a = 0;
			
			ArrayList<String> arr = new ArrayList<String>();
			String str = s;
			
			//���ڿ� �ڸ���
			while(str.length()>i) {
				arr.add(str.substring(0,i));
				str = str.substring(i);
			}
			arr.add(str);
			
			//����̳� �ݺ��ϴ��� ����ϱ�
			int count = 1;
			for(int j=1;j<=arr.size();j++) {
				if(j<arr.size()) {
					if(arr.get(j).equals(arr.get(j-1))) {
						count++;
					}else if (count!=1) {
						a = a+(i*count)-(count+i-3)+i;
						System.out.println(i+"���� �������� a 1 : "+a);
						count = 1;
					}
				}else if(count!=1) {
					a = a+(i*count)-(count+i-3);
					System.out.println(i+"���� �������� a 2 : "+a);
				}else {
					a += arr.get(arr.size()-1).length();
				}
			}
			
			System.out.println(i+"���� �������� a 3 : "+a);
			if(a!=0&&a<answer)
				answer = a;
		}
		
		System.out.println(answer);
	}

}
