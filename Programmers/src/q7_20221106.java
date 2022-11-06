
public class q7_20221106 {

	public static void main(String[] args) {
		
		Solution7 sl = new Solution7();
		System.out.println(sl.solution(100));

	}

}
class Solution7 {
    public String solution(int age) {
        String answer = "";

        String aAge ="abcdefghij";
        String[] arr = aAge.split("");
        
        String str = Integer.toString(age);
        for(int i = 0; i < str.length(); i++) {
        	char ch = str.charAt(i);
        	answer += arr[ch-48];
        }
        return answer;
    }
}