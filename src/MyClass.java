import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.test.pojo.Student;

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

		Student student1 = new Student();
		student1.setStudentId(1);
		student1.setStudentName("Shivam Pathak");
		student1.setemail("pathak@gmail.com");
		student1.setMobileNumber(989898989);

		Student student2 = new Student();
		student2.setStudentId(1);
		student2.setStudentName("Sanjeev Singh Jastoda");
		student2.setemail("jastoda@gmail.com");
		student2.setMobileNumber(989898989);

		Student student3 = new Student();
		student3.setStudentId(1);
		student3.setStudentName("Rahul kr Modi");
		student3.setemail("modi@gmail.com");
		student3.setMobileNumber(989898989);

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);

		studentList.stream().forEachOrdered(System.out::println);

	}

}
