package packageA;

public class StaticUseCase {

	 static int count = 1;

	 static int incrementCount() {
		return ++count;
	}

	 static int decrementCount() {
		return --count;
	}

	public static void main(String[] args) {

		StaticUseCase sc = new StaticUseCase();

		int a = StaticUseCase.incrementCount();
		System.out.println(a);

		int b = StaticUseCase.decrementCount();
		System.out.println(b);

		a = StaticUseCase.incrementCount();
		System.out.println(a);

	}
}