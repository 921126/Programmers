
public class q3_20221106 {

	public static void main(String[] args) {
		
		Solution3 sl = new Solution3();
		System.out.println(sl.solution(29183, 1));

	}

}
class Solution3 {
    public int solution(int num, int k) {
        int answer = 0;
        String str = "";
        
        str = Integer.toString(num);
        answer = str.indexOf(Integer.toString(k));
        
        if(answer > -1) {
        	answer += 1;
        }
        
        return answer;
    }
}
