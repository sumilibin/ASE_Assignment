import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
	
	public static void main(String[] args) {

		Integer [] numbers = { 1, 2, 3, 4, 5, 6, 7 };

		List<Integer> lst = Arrays.asList(numbers);

		Collections.shuffle(lst);

		lst.toArray(numbers);

		System.out.println(Arrays.toString(numbers));
	}

}
