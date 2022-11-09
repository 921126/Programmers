package q_20221107;

public class q1_20221107 {

	public static void main(String[] args) {
		
		int[] arr = {-1,1,0,-1};
		Solution sl = new Solution();
		System.out.println(sl.solution(arr));
		
	}
}

class Solution {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;
        
        for(int i = 0; i <numbers.length; i++) {
        	for(int j = 0; j < numbers.length; j++) {
        		if(i == j) continue;
        		if(numbers[i] * numbers[j] > answer) {
        			answer = numbers[i] * numbers[j];
        		}
        	}
        }
        return answer;
    }
}
