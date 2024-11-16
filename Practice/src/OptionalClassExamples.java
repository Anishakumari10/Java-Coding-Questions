import java.util.Optional;

public class OptionalClassExamples {

	public static void main(String[] args) {

		Optional<Integer> a = Optional.of(10);
		Optional<Integer> ofNullable = Optional.ofNullable(78);
		
//		Integer b = a.orElse(0);
//		System.out.println(b);
//		
//		int c = a.orElse(0);
//		System.out.println(c);
		
		int[] arr = {1,2,3,4,5,6};
		int left = 0;
		int right = arr.length - 1;
		
		while (left < right) {
		    int temp = arr[left]; //temp = 2
		    arr[left] = arr[right]; // arr[0] = 6
		    arr[right] = temp; //arr[5] = 1
		    left++;
		    right--;
		
		}
		for(int i : arr) {
			System.out.println(i);
		}
		
		
	}

}
