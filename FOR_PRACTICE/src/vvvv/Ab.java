package vvvv;

public class Ab {

	static int z;

	public static void main(String[] args) {
		Ab a = new Ab();
		a.z = 200;
		Ab a1 = new Ab();
		a1.z = 300;
		System.out.println(Ab.z);
		System.out.println(a.z);
		System.out.println(a1.z);
		

	}
}
