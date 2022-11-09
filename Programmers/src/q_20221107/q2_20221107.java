package q_20221107;

import java.util.Arrays;

public class q2_20221107 {
	
	public static void main(String[] args) {
		
		Solution2 sl = new Solution2();
		System.out.println(sl.solution("pfqallllabwaoclk", 2));
	}
}

class Solution2 {
    public String solution(String cipher, int code) {
        String answer = "";
        
        String[] arr = cipher.split("");
        System.out.println(Arrays.toString(arr));
        for(int i = code-1; i < arr.length; i+=code) {
        		answer += cipher.charAt(i);
        }
        return answer;
    }
}