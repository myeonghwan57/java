package ch06;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Powder powder = new Powder();
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		printer.setMaterial(powder);
		Powder p = (Powder) printer.getMaterial();
		System.out.println(p.toString());
	}

}
