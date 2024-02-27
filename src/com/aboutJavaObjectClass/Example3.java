package com.aboutJavaObjectClass;

public class Example3 {

	public static void main(String[] args) {
		
		
		Student student1 = new Student(101, "Vijay", 78);
		Student student2 = new Student(102, "Kiran", 87);
		Student student3 = new Student(104, "Ram", 78);
		Student student4 = new Student(108, "Jay", 67);
		Student student5 = new Student(111, "Siva", 56);
		Student student6 = new Student(190, "Sachin", 78);
		
		Student students[] = {student1, student2, student3, student4, student5, student6};
		
		for(Student student: students)
		{					
			int marks = 70;
			
			if(student.getStudentMarks() == marks)
			{
				System.out.println(student.toString());
			}
		}

	}

}
