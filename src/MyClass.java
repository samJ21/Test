import java.util.Arrays;
import java.util.List;

public class MyClass {
	static {
		System.out.println(" Static Block Printed");
	}
	private static String name = "Sanjeev";

	public static void main(String[] args) {
		System.out.println(" MY class Printed ");
		System.out.println(name);
		List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println(myList);
		myList.stream().forEachOrdered(System.out::println);

	}

}
