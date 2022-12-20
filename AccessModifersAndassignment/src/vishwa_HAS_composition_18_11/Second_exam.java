package vishwa_HAS_composition_18_11;
// inheritance
//HAS relationship
class AAA {
	D d;
	E e;

	AAA() {
		this.d = new D();
		this.e = new E();
	}
}

class D {
	int a = 30;
	int b = 40;

	int minus(int a, int b) {

		int v = a - b;
		return v;

	}

}

class E {
	int a = 10;
	int b = 20;

	int sum(int a, int b) {
		int n = a + b;
		return n;

	}
}

public class Second_exam {

	public static void main(String[] args) {
		
		AAA a = new AAA();
		
		D d = new D();
		E e = new E();
		
	
		
		
	}

}
