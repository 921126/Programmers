package q_20221109;

public class q1_20221109 {

	public static void main(String[] args) {
		
		Solution sl = new Solution();
		System.out.println(sl.solution(7));
		
	}
}
class Solution {
    public int solution(int n) {
        int answer = 1;
        
        int num = 1;
        for(int i = 1; i <=10; i++) {
        	num *= i;
        	if(num == n) {
        		answer = i;
        	}else if(num < n) {
        		answer = i;
        	}
        }
        return answer;
    }
}
