package StreamsPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

	class Address{
	private String city;
	private String street;
	

	public Address(String city, String street) {
		super();
		this.city = city;
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + "]";
	}
	
}

public class Employee {

	public String name;
	public long salary;
	public String department;
	public Address address;
	private static Object[] array;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public Employee(String name, long salary, String department, Address address) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}


	public static void main(String[] args) {

//		int[] a = { 1, 3, 4, 1, 2, 4, 5, 9 };
//
//		List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
//		list.stream().filter(i -> Collections.frequency(list, i) > 1).distinct().forEach(System.out::println);

		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee("Vikas", 10000000, "ISE",new Address("Delhi","CP")));
		employees.add(new Employee("Jane ", 50000, "CSE",new Address("NY","TS")));
		employees.add(new Employee("Bob", 900000, "CIVIL",new Address("LA","Mst.")));
		employees.add(new Employee("Sarah", 893832, "ECE",new Address("Hyd","Uppal")));
		employees.add(new Employee("aamir",993832,"CSE",new Address("Amd","Sk")));
		
		
		Map<String, Address> collect2 = employees.stream().collect(Collectors.toMap(Employee::getName,Employee::getAddress));
		//System.out.println(collect2);

//		employees.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).skip(3)
//				.collect(Collectors.toList()).forEach(System.out::println);

		List<String> month = List.of("Jan", "Feb", "Mar", "Apr", "May", "Jun");

		//month.stream().sorted().collect(Collectors.toList()).forEach(System.out::print);

	

//		employees.stream().map(Employee:: getName).sorted().forEach(System.out::println);
//		
//		employees.stream().sorted(Comparator.comparingLong(Employee:: getSalary).reversed()).forEach(System.out::println);

//		Optional<Employee> first = employees.stream().filter(e -> "ECE".equals(e.getDepartment())).max(Comparator.comparing(Employee::getSalary));
//		System.out.println(first);

//		employees.stream().
//		filter(e -> "ECE".equals(e.getDepartment())).sorted(Comparator.comparing(Employee::getName)).sorted().forEach(System.out::println);

//		Optional<Employee> getSalary = employees.stream().max(Comparator.comparing(Employee :: getSalary));
//		System.out.println(getSalary);

//		List<String> list = new ArrayList<String>();
//		list.add("A");list.add("B");list.add("C");

		List<Integer> nums = List.of(1, 1, 3, 5, 6, 7, 7, 9);
		Integer maxnum = nums.stream().max((o1, o2) -> o1.compareTo(o2)).get();
		//System.out.println(maxnum);
		
		String s = "Tree is green Tree has leaves leaves are green!";
		String[] split = s.split("\\W");
		List<String> l1 = new ArrayList<>();
		
		for(String l:split) {
			l1.add(l);
		}
		
		 Map<String, Long> collect3 = l1.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
		 collect3.entrySet().stream().filter(e->e.getValue()>1).forEach(System.out::println);

//		Set<Integer> dupNum = new HashSet<Integer>();
//		nums.stream().filter(e -> !dupNum.add(e)).forEach(System.out::println);

		// 2,234,4,5,7,23,22
		List<Integer> numbers = List.of(2, -22, 1);
		// numbers.stream().map(e -> e.toString()).filter(e -> e.startsWith("2")||
		// e.startsWith("-2")).map(e ->
		// Integer.parseInt(e)).forEach(System.out::println);

//		Optional<Integer> sum = numbers.parallelStream().parallel().reduce((p, q)->p+q);
//		System.out.println(sum);

//		String a[] = {"a","a","b","c","c"};
//		
//		List<String> list =  Arrays.asList("AA","BB","BB" ,"AA","CC","AA");
//		Map<String, Long> collect = Arrays.stream(a).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
//		Arrays.stream(a).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
//		
//		System.out.println(collect);
		
		
	/*	String a = "It is a good day";
		//char[] c = a.toCharArray();
		Map<Character, Long> collect = a.chars().mapToObj(c -> (char) c).filter(c -> !Character.isSpaceChar(c))
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		for(Map.Entry<Character, Long> hm : collect.entrySet()) {
			if (hm.getValue() > 1){
				System.out.println(hm.getKey() + "->"+hm.getValue());
			}
		}
		//System.out.println(collect);
		*/
		
		//int[] l1 = {2,6,5,4,9,0};
		int[] l2 = {1,3,7,4,8,3};
		List<Integer> num = List.of(2, 22, 1,4,5);
		List<Integer> num2 = List.of(1, 22, 3,4,5);
		
		List<Integer> list = Stream.concat(num.stream(), num2.stream()).distinct().map(e -> e * e)
				.sorted((e1, e2) -> e1 - e2).toList();
		System.out.println(list);
		
		//IntStream.concat(Arrays.stream(l1), Arrays.stream(l2)).sorted().forEach(System.out::println);
		Map<Boolean, List<Integer>> collect = num.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
		//System.out.println(collect);
	
	
	List<Integer>a = List.of(1,3,4,5,6,6,8);
	Object[] array2 = a.stream().distinct().toArray();
	//for(Object i:array2)
	//System.out.println(i);
	
	}
	
}
