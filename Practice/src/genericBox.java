
public class genericBox<T> {

	private T value;

	public void setValue(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public static <T> void printArray(T[] array) {

		for (T e : array) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		genericBox<Integer> intbox = new genericBox<Integer>();
		intbox.setValue(10);
		int getValue = intbox.getValue();
		System.out.println(getValue);

		genericBox<String> stringBox = new genericBox<String>();
		stringBox.setValue("Anisha");
		String getName = stringBox.getValue();
		System.out.println(getName);

		String a[] = { "abhi", "sony" };
		Integer b[] = { 1, 2, 3, 4, 5, 6 };

		printArray(a);
		printArray(b);
		
		
	}

}
