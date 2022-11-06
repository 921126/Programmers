import java.util.Arrays;

public class q2_20221106 {

	public static void main(String[] args) {
		
		int[] arr = {7,77,14};
		Solution2 sl = new Solution2();
		System.out.println(sl.solution(arr));
		
	}
}

class Solution2 {
    public int solution(int[] array) {
        int answer = 0;
        String str ="";
        
        //글자합치기
        for(int i =0; i < array.length; i++) {
        	str += array[i];
        }
        
        String[] arr = new String[str.length()];
        arr = str.split("");

        //글자수 카운트
        for(int i =0; i <str.length(); i++) {
        	if(arr[i].equals("7")) {
        		answer++;
        	}
        }
        
        return answer;
    }
}