package q_20221110;

public class q2_20221110 {
	
	public static void main(String[] args) {
		
		Solution2 sl = new Solution2();
		System.out.println(sl.solution("10", "11"));
		
	}

}
class Solution2 {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        Integer num1 = Integer.parseInt(bin1,2);
        Integer num2 = Integer.parseInt(bin2,2);
        Integer sum = num1+num2;
        answer = Integer.toBinaryString(sum);
        return answer;
    }
}
