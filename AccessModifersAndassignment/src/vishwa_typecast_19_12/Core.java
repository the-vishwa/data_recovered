package vishwa_typecast_19_12;
class HP{
	
	int a =10;
	int b =20;
	
	void DoOpration(Object obj) {
		
//		float f=36.4F;
//		int a= (int)f;
		
		A aa =(A)obj;
		aa.m1();
		
	}
	
}
class A {
	void m1() {
		System.out.println("m1 of A");
	}
}

public class Core {
public static void main(String[] args) {
	A a = new A();
	
	HP h = new  HP();
	h.DoOpration(a); // or 
	
	//h.DoOpration(new A());
	
	//A a1=a;
	
	
	
	
	
	
	
	
	
	
	
	
	
//	h.Operation(a);// refe vari or 
	
	//h.Operation(new A()); //objrct
	
	
}

}
