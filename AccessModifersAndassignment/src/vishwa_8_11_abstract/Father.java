package vishwa_8_11_abstract;

public abstract class Father {

	String homeName;
	String where;
	long expect;

	abstract void getFuture(String name,int homeNumber);

}
class Son extends Father {
	
	String homeName="VISHWAPREM";
	String where="village";
	long expect= 1500000l;
	
	
	void getFuture(String name, int homeNumber) {
		System.out.println(name);
		System.out.println(homeNumber);
	
	}
	
//public static void main(String[] args) {
//		
//		Son son = new Son();
//		System.out.println(son.homeName);
//		System.out.println(son.where);
//		System.out.println(son.expect);
//		son.getFuture();
//	}
}
