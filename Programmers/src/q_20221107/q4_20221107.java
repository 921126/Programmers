package q_20221107;

public class q4_20221107 {
	
	public static void main(String[] args) {
		
		Solution4 sl = new Solution4();
		System.out.println(sl.solution(".... . .-.. .-.. ---"));
		
	}

}
class Solution4 {
    public String solution(String letter) {
        String answer = "";
        String[] mos = {
        		".-", "-...", "-.-.", "-..", ".", "..-.",
        	    "--.", "....","..",".---","-.-",".-..",
        	    "--","-.","---",".--.","--.-",".-.",
        	    "...","-","..-","...-",".--","-..-",
        	    "-.--","--.."};
        String[] alpa = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] arr = letter.split(" ");
        
        for(int i=0; i<arr.length; i++) {
        	for(int j = 0; j<mos.length; j++) {
        		if(arr[i].equals(mos[j])) {
        			answer += alpa[j];
        		}
        	}
        }
        
        return answer;
    }
}