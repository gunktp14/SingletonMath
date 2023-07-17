


public class MathSingleton {
	private static MathSingleton mathinstance;
	private int var1;
	private int var2;
	private MathSingleton(){
		
	}; 
	
	public static MathSingleton getInstance() {
		if(mathinstance == null){
			
			mathinstance = new MathSingleton();
		};
		return mathinstance;
	};
	
	//others method 
	
	public int getVar1() {
		return this.var1;
	}
	
	public void setVar1(int number) {
		this.var1 = number;
	}
	
	public int getVar2() {
		return this.var2;
	}
	
	public void setVar2(int number) {
		this.var2 = number;
	}
	
	
	
	public int add () {
		return this.var1 + this.var2;
	}
	
	public int subtract() {
		return this.var1 - this.var2;
	}
	
	public int multiply() {
		return this.var1 + this.var2;
	}
	
	public int divide() {
		return this.var1 / this.var2;
	}
}
