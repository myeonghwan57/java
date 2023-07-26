package ch09;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer Cp = new Desktop();
		Desktop Dt = new Desktop();
		MyNoteBook Mn = new MyNoteBook();
		NoteBook N = new MyNoteBook();
		
		
		Cp.display();
		Dt.display();
		Mn.display();
		Mn.typing();
		N.display();

	}

}
