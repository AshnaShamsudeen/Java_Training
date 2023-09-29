package dateandtime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class EmployeeOperations {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1(1001, "shyma", 4200, LocalDate.parse("2020-08-23"));
		List<Employee1> emps = new ArrayList<>(List.of(e1));
		System.out.println(e1);

	}
}
