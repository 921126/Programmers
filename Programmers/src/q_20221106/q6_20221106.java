package q_20221106;

public class q6_20221106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution6 sl = new Solution6();
		System.out.println(sl.solution("abCdEfghIJ"));
		
	}

}
class Solution6 {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i ++) {
        	char ch = my_string.charAt(i);
        	
        	for(int j = 65; j <= 122; j++) {
        		if(65 <= ch && ch <= 90) {
        			answer += (char)(ch+32);
        			break;
        		}else {
        			answer += (char)(ch-32);
        			break;
        		}
        	}
        	
        }
       
        return answer;
    }
}