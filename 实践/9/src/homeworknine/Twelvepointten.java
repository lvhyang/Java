package homeworknine;

class stackSOF {
	private int length=1;
	public void stackLeak( ) {
		length++;
		stackLeak( );
	}
}

public class Twelvepointten {

public static void main(String[] args) {
	stackSOF m = new stackSOF();
	while(true) {
		try {
			m.stackLeak();
		}
		catch(OutOfMemoryError ex) {
			System.out.println(ex);
		}
	}
}
}
