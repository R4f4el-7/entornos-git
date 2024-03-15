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
    public int bSumax(int num) {
		
		return b+num;
	}
    public int bProductox(int num) {
		
		return b*num;
	}
    
    public int xAlCuadrado(int num) {
    	return num*num;
    }
    public void correcto() {
	    System.out.println("Incorrecto");
    	System.out.println("correcto");
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
	public int aSumax(int num){
		
		return a+num;
	}
	public int aRestax(int num){
		
		return a+num;
	}
}
