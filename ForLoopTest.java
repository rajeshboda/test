import java.util.ArrayList;
import java.util.List;

public class ForLoopTest {
	

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		List<Integer> li = new ArrayList<Integer>();

		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);
		for (Integer val : li) {
			System.out.println(val);
		}

	}
}