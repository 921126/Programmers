package q_20221110;

import java.util.Arrays;

public class q3_20221110 {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6};
		Solution3 sl = new Solution3();
		System.out.println(sl.solution(arr, 5));

	}

}
class Solution3 {
	public int solution(int[] numbers, int k) {
		int answer = 0;
		answer = numbers[(2 * (k-1) % numbers.length)];
		return answer;
	}
}