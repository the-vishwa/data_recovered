package vishwa_typecast_19_12;
class HP{
	
	int a =10;
	int b =20;
	
	void Operation(Object o) {
		A aa = (A)o; //typecast only is in case 3
		aa.m1();
	}
}
class A {
	void m1() {
		System.out.println("m1 of Intel");
	}
}

public class Core {
public static void main(String[] args) {
	A a = new A();
	HP h = new HP();
	h.Operation(a);// refe vari or 
	
	//h.Operation(new A()); //objrct
	
	
}

}
