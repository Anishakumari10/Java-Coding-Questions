package packageA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Student {
	String name;
	List<Subjects> subjects;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Subjects> getSubjects() {
		return subjects;
	}

	public Student(String name, List<Subjects> subjects) {
		super();
		this.name = name;
		this.subjects = subjects;
	}

	public void setSubjects(List<Subjects> subjects) {
		this.subjects = subjects;
	}

}

class Subjects {

	String subjectName;
	Integer marks;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public Subjects(String subjectName, Integer marks) {
		super();
		this.subjectName = subjectName;
		this.marks = marks;
	}

}

public class studentStreamQues {
	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		// Create subjects for the first student
		List<Subjects> subjects1 = new ArrayList<>();
		subjects1.add(new Subjects("Maths", 90));
		subjects1.add(new Subjects("Science", 85));

		// Create the first student
		students.add(new Student("Anisha", subjects1));

		// Create subjects for the second student
		List<Subjects> subjects2 = new ArrayList<>();
		subjects2.add(new Subjects("Maths", 78));
		subjects2.add(new Subjects("English", 88));

		// Create the second student
		students.add(new Student("Rahul", subjects2));

		// Create subjects for the third student
		List<Subjects> subjects3 = new ArrayList<>();
		subjects3.add(new Subjects("History", 92));
		subjects3.add(new Subjects("Geography", 80));

		// Create the third student
		students.add(new Student("Priya", subjects3));

		// Print the student details
		for (Student student : students) {
			System.out.println("Student Name: " + student.name);
			for (Subjects subject : student.subjects) {
				System.out.println("Subject: " + subject.subjectName + ", Score: " + subject.marks);
			}
			System.out.println(); // Add a blank line between students
		}
		//students.stream().filter(s -> s.getSubjects().stream().anyMatch(sb -> sb.getSubjectName().equals("Maths")));
		
		Optional<Subjects> topMathsSubject = students.stream()
	            .flatMap(student -> student.getSubjects().stream())
	            .filter(subject -> subject.getSubjectName().equals("Maths"))
	            .max(Comparator.comparingInt(Subjects::getMarks));
		
		
//		students.stream().filter(s -> s.getSubjects().stream().anyMatch(sb -> sb.getSubjectName().equals("Maths")))
//				.max(Comparator.comparingInt(s -> s.getSubjects().stream()
//						.filter(sb -> sb.getSubjectName().equals("Maths"))
//						.findFirst()
//						.get()
//						.getMarks()));
		
		students.stream()
	    .filter(s -> s.getSubjects().stream().anyMatch(sb -> sb.getSubjectName().equals("Maths")))
	    .max(Comparator.comparingInt(s -> s.getSubjects().stream()
	        .filter(sb -> sb.getSubjectName().equals("Maths"))
	        .findFirst()
	        .get()
	        .getMarks()))
	    .ifPresent(s -> System.out.println("Student: " + s.getName()));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
