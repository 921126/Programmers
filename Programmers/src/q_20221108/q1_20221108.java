package q_20221108;

import java.util.Arrays;

public class q1_20221108 {

	public static void main(String[] args) {

		Solution sl = new Solution();
		System.out.println(sl.solution("allpe", "apple"));

	}
}

class Solution {
	public int solution(String before, String after) {
		int answer = 0;
		char[] bArr = new char[before.length()];
        char[] aArr = new char[after.length()];
        
        for(int i = 0; i < before.length(); i++){
            bArr[i] = before.charAt(i);
            aArr[i] = after.charAt(i);
        }
        
        Arrays.sort(bArr);
        Arrays.sort(aArr);
		
        System.out.println(Arrays.toString(bArr));
        System.out.println(Arrays.toString(aArr));
        
        for(int i = 0; i < bArr.length; i++) {
        	if(bArr[i] != aArr[i]) {
        		answer = 0;
        		break;
        	}else {
        		answer = 1;
        	}
        }
        
        
		return answer;
	}
}
