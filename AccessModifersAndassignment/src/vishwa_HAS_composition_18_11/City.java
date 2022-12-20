package vishwa_HAS_composition_18_11;
//inheritance
// HAS relationship
class A {
	B b;
	C c;

	A(B b, C c) {
		this.b = b;
		this.c = c;
	}

	void m1() {

	}
}

class B {
	int a = 30;
	int b = 40;

	int minus(int a, int b) {

		int v = a - b;
		return v;

	}

}

class C {
	int a = 10;
	int b = 20;

	int sum(int a, int b) {
		int n = a + b;
		return n;

	}
}

public class City {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();

		A a = new A(b, c);

	}

}
//strong association
//anadar kuch method h o jis ko method chahiye o c.method cll kardega 
// jis ko method chahiye o b.method cll kardega
// reuse