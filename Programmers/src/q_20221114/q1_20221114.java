package q_20221114;

import java.util.Arrays;

public class q1_20221114 {

	public static void main(String[] args) {

		String[] arr = {"down", "down", "down", "down", "down"};
		int[] size = {7,9};

		Solution sl = new Solution();
		System.out.println(sl.solution(arr, size));

	}	
}

class Solution {
	public int[] solution(String[] keyinput, int[] board) {
		int[] answer = new int[2];
		int x = 0;
		int y = 0;
		int mapx = (board[0]-1)/2;
		int mapy = (board[1]-1)/2;
		for(int i = 0; i < keyinput.length; i++) {

			switch (keyinput[i]) {
			case "left":
				if(x > (mapx *-1)) {
					x--;
				}
				break;
			case "right":
				if(x < mapx) {
					x++;
				}
				break;
			case "up":
				if( y < mapy) {
					y++;
				}
				break;
			default:
				if(y > (mapy *-1)) {
					y--;					
				}
				break;
			}
		}
		
		answer[0] = x;
		answer[1] = y;
		return answer;
	}
}