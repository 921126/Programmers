package q_20221107;

public class q3_20221107 {

	public static void main(String[] args) {
		
		Solution3 sl = new Solution3();
		System.out.println(sl.solution(15));
		
	}
	
}
class Solution3 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++) {
        	if( i == 1 || i == 2) continue;
        	if(i % 2 == 0) {
        		answer++;
        	}else if(i % 2 == 1) {
        		int count =0;
        		for(int j = 1; j <= n; j++) {
        			if(i % j == 0) {
        				count++;
        				if(count >= 3) {
        					answer += 1;
        					break;
        				}
        			}else {
        				continue;
        			}
        		}
        	}
        }
        return answer;
    }
}