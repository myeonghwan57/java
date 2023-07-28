package ch11;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 2;
		Calc c = new CompleteCalc();
		
		System.out.println(c.add(num1, num2));
		System.out.println(c.substract(num1, num2));
		System.out.println(c.divide(num1, num2));
		System.out.println(c.times(num1, num2));
		
		CompleteCalc c2 = new CompleteCalc();
		
		c2.showInfo();
		
		
	}

}
