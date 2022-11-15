package q_20221114;

import java.util.Arrays;

public class q3_20221114 {
	
	public static void main(String[] args) {
		
		int[] arr = {100, 95, 2, 4, 5, 6, 18, 33, 948};
		Solution3 sl = new Solution3();
		System.out.println(sl.solution(arr, 3));
		
	}

}
class Solution3 {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];

        for(int i = 0; i < answer.length; i++) {
        	for(int j = 0; j < n; j++) {        		
        		answer[i][j] = num_list[i*n+j];
        	}
        }
       // System.out.println(Arrays.deepToString(answer));
        return answer;
    }
}