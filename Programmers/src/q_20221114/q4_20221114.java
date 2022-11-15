package q_20221114;

import java.util.Arrays;

public class q4_20221114 {

	public static void main(String[] args) {
		
		Solution4 sl = new Solution4();
		System.out.println(sl.solution("asdasdsdA"));
		
	}
}
class Solution4 {
    public int solution(String my_string) {
        int answer = 0;
        
        //정규표현식 - 숫자가 아닌 것들은 전부 바꾸기/ 공백 2개짜리 1개로 바꾸기, 앞뒤 공백 제거하고 숫자만 남기기
        String str = my_string.replaceAll("\\D", " ").replaceAll("\\s+", " ").trim();
        //System.out.println(str);
        String[] arr = str.split(" ");
        
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr.length);
        
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
        	
        	try {
        		if(!arr[i].equals(" ")) {
        			sum += Integer.parseInt(arr[i]);
        		}
			} catch (Exception e) {
				answer = 0;
			}
        }
        
//        System.out.println(sum);
        answer = sum;
        return answer;
    }
}