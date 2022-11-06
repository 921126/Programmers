import java.util.Arrays;

public class q4_20221106 {

	public static void main(String[] args) {

		Solution4 sl = new Solution4();
		System.out.println(sl.solution("6 - 1 - 4"));
									//  0 1 2 3 4
	}

}

class Solution4 {
	public int solution(String my_string) {
		int answer = 0;

		String[] arr = my_string.split(" ");
		int cal = Integer.parseInt(arr[0]);

		System.out.println(3 % 2);
		for(int i = 0;i<arr.length;i++) {
			//0번 배열 값은 이미 넣었으니 뛰어넘기
			if(i == 0) continue;
			// 수식이 들어있는 배열번째라면 
			if(i % 2 == 1) {
				if(arr[i].equals("+")) {
					cal += Integer.parseInt(arr[i+1]);
				}else{
					cal -= Integer.parseInt(arr[i+1]);
				}
			}
		}
		answer = cal;
		return answer;
	}
}
