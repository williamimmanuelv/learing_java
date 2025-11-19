package emc_java_tutorial;

public class Student {
	
	int marks;
	String name;
	
	Student(int a, String b){
		System.out.println("hi from constructor");
		marks = a;
		name =b;
	}
	
	public static void main(String[] args) {
		Student stu1 = new  Student(32,"john");
		Student stu2 = new  Student(45,"william");
		System.out.println(stu2.marks);
		
//		int b = stu.a;
//		System.out.println(b);
//		System.out.println(b);

	}

}
