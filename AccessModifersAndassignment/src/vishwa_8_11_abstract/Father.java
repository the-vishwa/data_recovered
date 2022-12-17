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

}
