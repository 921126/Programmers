package q_20221115;

import java.util.Arrays;

public class q3_20221115 {

	public static void main(String[] args) {

		Solution3 sl = new Solution3();
		System.out.println(sl.solution("1 Z Z 2 3"));

	}

}

class Solution3 {
	public int solution(String s) {
		int answer = 0;

		String[] arr = s.split(" ");
		System.out.println(Arrays.toString(arr));

		int sum = 0;
		for(int i = 0; i < arr.length; i++) {

			try {
				//만약에 숫자라면
				if(!arr[i].equals("Z")) {
					//더하기
					sum +=  Integer.parseInt(arr[i]);
				//만약에 글자 Z라면
				}else {
					if (sum  != 0 ) {
						sum -= Integer.parseInt(arr[i-1]);
					}
				}				
			} catch (Exception e) {
				
			}
		}

		return answer = sum;
	}
}