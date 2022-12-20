package vishwa_13_11_child_parent;

public class A {

	void m1() {
		System.out.println("m1 parent");
	}
	void m2() {
		System.out.println("m2 parent");
	}
}
class B extends A{
	void m1() {
		System.out.println("m1 child");
	}
	void m3() {
		System.out.println("m3 child");
	}
	
}