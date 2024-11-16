package packageA;

import java.io.FileNotFoundException;
import java.io.IOException;

class SuperClass {
	void display() throws FileNotFoundException {
		System.out.println("IO");
	}
}

class SubClass extends SuperClass {

	@Override
	void display() { // Valid, as FileNotFoundException is a subclass of IOException
		System.out.println("Sub");
	}

	public static void main(String[] args) {

	}

}
