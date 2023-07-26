package ch10;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AICar aicar = new AICar();
		aicar.run();
		
		System.out.println("========================");
		
		ManualCar mancar = new ManualCar();
		mancar.run();

	}

}
