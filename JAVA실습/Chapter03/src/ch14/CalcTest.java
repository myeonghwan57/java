package ch14;

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
		c.description();
		
		CompleteCalc c2 = new CompleteCalc();
		
		c2.showInfo();
		
		
		//static 메서드이기 때문에 인스턴스에 상관없이 사용가능
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));
	}

}
