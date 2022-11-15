package q_20221115;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class q2_20221115 {
	public static void main(String[] args) {
		
		Solution2 sl = new Solution2();
		System.out.println(sl.solution(420));
		
		
	}

}
class Solution2 {
    public Integer[] solution(int n) {
    	Integer[] answer = {};
        
        Set<Integer> arr = new HashSet<>();
        for(int i = 2; i<= Math.sqrt(n); i++) {
        	while(n % i == 0) {
        		//System.out.println(i);
        		arr.add(Integer.valueOf(i));
        		n /= i;
        	}
        }
        if( n != 1) {
        	//System.out.println(n + "dd");
        	arr.add(Integer.valueOf(n));
        }
        
        //System.out.println(arr);
        answer = arr.toArray(new Integer[0]);
        Arrays.sort(answer);
        //System.out.println(Arrays.toString(answer));
        return answer;
    }
}