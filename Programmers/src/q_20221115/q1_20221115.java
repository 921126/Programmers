package q_20221115;

public class q1_20221115 {
	
	public static void main(String[] args) {
		
		Solution sl = new Solution();
		System.out.println(sl.solution("onetwothreefourfivesixseveneightnine"));
	}

}
class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] arr2 = {"0","1","2","3","4","5","6","7","8","9"};
        
        String str = "";
        for(int i =0; i < 10; i++) {
        	str = numbers.replace(arr[i],arr2[i]);
        	numbers = str;
        }
        answer = Long.parseLong(str);
        return answer;
    }
}