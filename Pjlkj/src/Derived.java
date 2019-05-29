import java.io.File;
import java.io.IOException;

class Base {
	int i = 99;

	public void amethod() {
		System.out.println("   Base.amethod()  ");
	}

	Base() {
		amethod();
	}
}

public class Derived extends Base {
	int i = -1;

	public static void main(String argv[]) throws IOException {
		File file=new File("d:/z-123/");
		file.createNewFile();
		Base b = new Derived();
		System.out.print(b.i);
		b.amethod();
	}

	public void amethod() {
		System.out.print("   Derived.amethod()  ");
	}
}