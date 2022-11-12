package q_20221109;

public class q3_20221109 {
	
	public static void main(String[] args) {
		
		Solution3 sl = new Solution3();
		System.out.println(sl.solution(1, 13, 1));
	}

}
class Solution3 {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        //글자로 만들기
        String str = "";
        for(int ii = i; ii <= j; ii++) {
        	str += ii;
        }
        
        //글자를 분해하기
        int count = 0;
        for(int jj = 0; jj<str.length(); jj++) {
        	char ch = str.charAt(jj);

        	if(ch - 48 == k) {
        		count++;
        	}
        }
        
        answer = count;
//        System.out.println(str);
//        System.out.println(count);
        return answer;
    }
}
