package q_20221108;

import java.util.Arrays;

public class q2_20221108 {

	public static void main(String[] args) {

		int[] arr = {30, 10, 23, 6, 100};
		Solution2 sl = new Solution2();
		System.out.println(sl.solution(arr));
	}

}

class Solution2 {
	public int[] solution(int[] emergency) {
		int[] answer = new int[emergency.length];

		for(int i = 0; i < emergency.length; i++) {
			for(int j = 0; j < emergency.length; j++) {
				
				if(emergency[i] < emergency[j]) {
					answer[i]++;
				}else if(emergency[i] == emergency[j]) {
					answer[i]++;
				}
			}
		}
		return answer;
	}
}