import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNo {

	public static void main(String[] args) {

		List<Integer> nums = List.of(1, 2, 3, 3, 4, 4, 6, 8, 9, 10);
		Integer a[] = {2,1, 3, 7, 4, 4, 6, 8, 9};
		/*
		 * Optional<Integer> secondHighest =
		 * Arrays.stream(a).distinct().sorted(Comparator.reverseOrder()).skip(1)
		 * .findFirst(); System.out.println(secondHighest);
		 */
		
	
	//second largest number
	int highest = Integer.MIN_VALUE;
	int secondHighest = Integer.MIN_VALUE;
	for (Integer num : nums) { // 2,4,3,1,6,8
		if (num > highest) {
			secondHighest = highest;
			highest = num;
		} else if (num > secondHighest) {
			secondHighest = num;
		}
	}
	System.out.println(secondHighest);
		
		
	}
	

	} 

