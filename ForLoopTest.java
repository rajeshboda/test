import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
public class ForLoopTest {

	public static void main(String[] args) {
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
		try {
		      FileWriter myWriter = new FileWriter("output.txt");
		      myWriter.write("Files in Java might be tricky, but it is fun enough!");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
}
