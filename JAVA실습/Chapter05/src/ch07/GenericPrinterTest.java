package ch07;

public class GenericPrinterTest {

	public static void main(String[] args) {
	
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		Powder p = new Powder();
		powderPrinter.setMaterial(p);
		
		Powder p2 = powderPrinter.getMaterial();
		System.out.println(powderPrinter.toString());
	}

}
