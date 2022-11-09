package q_20221108;

public class q3_20221108 {
	
	public static void main(String[] args) {
		
		Solution3 sl = new Solution3();
		System.out.println(sl.solution(30, 7));
		
	}
}

class Solution3 {
    public long solution(int balls, int share) {
        
       long bFac = fac(balls);
       long sFac = fac(share);
       
//       System.out.println("n! > " +bFac );
//       System.out.println("m! > " +sFac );
       long answer = bFac / (fac(balls-share)* sFac);
       
       //System.out.println((fac(balls-share)* sFac));
       
        return answer;
    }
    
    public long fac (int n) {
    	
    	long fac = 1;
    	for(long i = 1; i <= n; i++) {
    		
    		fac *= i;
    	}
    	return fac;
    }
}

