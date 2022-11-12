package q_20221110;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class q1_20221110 {

	public static void main(String[] args) {
		
		
		Solution sl = new Solution();
		System.out.println(sl.solution("hello"));
		
		
	}
	
}
class Solution {
    public String solution(String s) {
        String answer = "";
        
        //문자나눠 담기
        String[] sArr = s.split("");
        
        //중복제거 set만들기
        Set<String> map = new HashSet<>();
        for(int i =0; i< s.length(); i++) {
        	map.add(sArr[i]);
        }

        //중복제거 set arr만들기
        String[] nArr = map.toArray(new String[0]);

        //카운트 저장용 배열
        int[] cArr = new int[nArr.length];
        
        //중복 카운트하기
        for(int j =0; j <nArr.length; j++) {
        	int count = 0;
        	for(int k = 0; k < sArr.length; k++) {
        		
        		if(nArr[j].equals(sArr[k])) {
        			count++;
        			cArr[j] =  count;
        		}
        	}
        }
        
        //답출력하기
        String[] result = new String[cArr.length];
        for(int i =0; i < cArr.length; i++) {
        	if(cArr[i] == 1) {
        		result[i] = nArr[i];
        		continue;
        	}else {
        		result[i] = "-99";
        	}
        }
        
        Arrays.sort(result);
        
        for(int i = 0; i < result.length; i++) {
        	if(!result[i].equals("-99")) {
        		answer += result[i]; 
        	}
        }
        
//        System.out.println(Arrays.toString(sArr));
//        System.out.println("중복제거배열>" + Arrays.toString(nArr));
//        System.out.println("카운트배열:" + Arrays.toString(cArr));
//        System.out.println("정답배열:" + Arrays.toString(result));
        
        return answer;
    }
}