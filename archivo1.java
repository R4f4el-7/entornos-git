package comando_git;

public class archivo1 {

	private int a;
	private int b;
	private int ans;
	
	public archivo1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public archivo1(int a, int b, int ans) {
		super();
		this.a = a;
		this.b = b;
		this.ans = ans;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getAns() {
		return ans;
	}

	public void setAns(int ans) {
		this.ans = ans;
	}
	
	public int suma() {
		
		return a+b;
	}
	public int resta() {
		
		return a-b;
	}
	public int aAlCuadrado() {
		
		return a*a;
	}
	public int bAlCuadrado() {
		
		return b*b;
	}
}
