package vishwa_HAS_agregation_18_11;

// inheritance
//HAS relationship
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
	void m2() {
		B b = new B();
		System.out.println(b.a);
		System.out.println(b.b);
		int r = b.minus(20, 30);
//		System.out.println(r);
	}

}

public class City {

	public static void main(String[] args) {
		C c = new C();
		c.m2();

	A a = new A(b, c);
	

	}

}
// weak association