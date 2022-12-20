package vishwa_HAS_composition_18_11;

class Student {
	String name;
	int rollNo;

	int minus(int a, int b) {
		int v = a - b;
		return v;
	}

}

class Teacher {
	void m1() {
		Student stu = new Student();
		stu.name = "vishwa";
		stu.rollNo = 1;
		int r = stu.minus(10, 20);
		System.out.println(stu.name);
		System.out.println(stu.rollNo);
		System.out.println(r);
	}
}

//class School {
//}

public class Example {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.m1();
	}

}
