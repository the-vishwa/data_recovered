package lamdaExpresion_FunctionalInterface;

interface Addition {
	int doSum(int a, int b);
}

class Aimpl implements Addition{

	@Override
	public int doSum(int a, int b) {
		return a + b;
	}

}

class OperationOn{
	void doCal(Addition a) {
		int sum = a.doSum(2, 2);
		System.out.println(sum);
	}
}
public class LamdaArgMethod {
public static void main(String[] args) {
	
	
	
	OperationOn op = new OperationOn();
	//Addition aa =(a,b)->a+b;
	    op.doCal((a,b)->a+b);
	
	//op.doCal((x,y)-> x+y);
	Addition a = new Aimpl();
	//op.doCal(new Aimpl());
	 op.doCal(a);
}
}
