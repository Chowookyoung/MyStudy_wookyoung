package LV1;

public class 소수만들기 {

	public static void main(String[] args) {
		
		int[] nums = {1,2,7,6,4};
		
		int answer = 0;//소수가 생성되는 갯수 count
		
		for(int i=0;i<nums.length-2;i++) {
			for(int j=i+1;j<nums.length-1;j++) {
				for(int k=j+1;k<nums.length;k++) {
					int numbers = nums[i]+nums[j]+nums[k];
					int l=2;
					while(l<numbers) {
						if(numbers%l==0) {
							break;
						}
						l++;
					}
					if(l==numbers) {
						answer++;
					}
				}
			}
		}
		
		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        System.out.println(answer);
		

	}

}
