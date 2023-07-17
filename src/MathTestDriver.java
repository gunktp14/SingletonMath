
public class MathTestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathSingleton m1 = MathSingleton.getInstance();
//		m1 = MathSingleton.getInstance();
		MathSingleton m2 = MathSingleton.getInstance();
		System.out.println(m1.equals(m2));
		
		m2.setVar1(60);
		m1.setVar2(10);
		
		System.out.println(m2.add());
		
		m1.setVar1(10);
		
		System.out.println(m1.add());
		System.out.println(m1.divide());
		System.out.println(m2.divide());

	}

}
