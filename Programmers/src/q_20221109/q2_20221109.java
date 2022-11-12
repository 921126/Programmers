package q_20221109;

import java.util.Arrays;

public class q2_20221109 {

	public static void main(String[] args) {

		int[] arr = {-1,1};
		Solution2 sl = new Solution2();
		System.out.println(sl.solution(arr, 0));

	}
}
class Solution2 {
	public int solution(int[] array, int n) {
		int answer = 0;
		int min = Integer.MAX_VALUE; //최소값 저장변수
		
		//배열정렬하기
		Arrays.sort(array);
		
		//반복해서 가장 가까운값 찾기
		for(int i =0; i < array.length; i++) {
			
			int abs = Math.abs(array[i] - n);
			if(min > abs) {
				min = abs;
				answer = array[i];
			}
		}
		//System.out.println(min);
		return answer;
	}
}