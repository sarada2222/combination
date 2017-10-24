package combination;

public class Combination_lib {
	private int s,r;
	
	public Combination_lib(int s, int r) {
		this.s = s;
		this.r = r;
	}
	
	static int getFactorial(int s){
		if(s == 0) {
			return 1;
		}else {
			return (s) * getFactorial(s-1);
			
		}
	}
}
