package vishwa_hashcode_14_12_22;

class A {
	int x;
	int y;

	@Override
	public String toString() {
		return  "ans=" +this.x  + ",ans=" +this.y;

	}
	@Override
	public int hashCode() {
		return this.x  +  this.y;
	}
}

public class Practice {

	public static void main(String[] args) {
		A a = new A();
		a.x=1;
		a.y=2;
		System.out.println(a);
		System.out.println(a.hashCode());

	}
}
