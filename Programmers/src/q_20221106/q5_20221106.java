package q_20221106;
import java.util.Arrays;

public class q5_20221106 {
	public static void main(String[] args) {
		
		
		
		Solution5 sl = new Solution5();
		System.out.println(sl.solution("hi12392"));
	}
}

class Solution5 {
    public int[] solution(String my_string) {
        int[] answer = {};
        String num ="";
        char ch;
        for(int i = 0; i < my_string.length(); i++) {
        	ch = my_string.charAt(i);
        	for(int j = 48; j <= 57; j++) {
        		if(ch == j) {
        			num += ch + " ";
        		}
        	}
        }
        String[] arr = num.split(" ");
        answer = new int[arr.length];
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(answer);
        return answer;
    }
}
