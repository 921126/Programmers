package q_20221107;

public class q5_20221107 {
	
	public static void main(String[] args) {
		
		Solution5 sl = new Solution5();
		System.out.println(sl.solution("people"));
		
	}

}

class Solution5 {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i =0; i < my_string.length(); i++) {
        	if(my_string.indexOf(my_string.charAt(i)) == i) {
        		answer += my_string.charAt(i);
        	}
        }
        
        return answer;
    }
}
