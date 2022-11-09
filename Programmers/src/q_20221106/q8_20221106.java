package q_20221106;

public class q8_20221106 {
	
	public static void main(String[] args) {
		
		int[] arr = {10,8,6};
		Solution8 sl = new Solution8();
		
		System.out.println(sl.solution(arr, 3));
		
	}

}

class Solution8 {
    public int solution(int[] box, int n) {
        int answer = (box[0]/n) * (box[1]/n) * (box[2]/n);
        return answer;
    }
}