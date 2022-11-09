package q_20221106;
import java.util.Arrays;

public class q1_20221106 {

	public static void main(String[] args) {


		Solution sl = new Solution();
		System.out.println(sl.solution("apple", 1));


	}
}

class Solution {
	public String[] solution(String my_str, int n) {

		int length = my_str.length()/n;
		//길이체크
		if(my_str.length() % n != 0) {
			length += 1;
		}
		//정답 배열 생성
		String[] answer = new String[length];

		//글자 자르기
		String tmp = "";
		for(int i =0; i<answer.length; i++) {
			if(my_str.length() >= n) {
				tmp = my_str.substring(0, n);
				my_str = my_str.substring(n);
			}else {
				tmp = my_str;
			}
			answer[i] = tmp;
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}
}
