package vaibhavpatil_14_10_2022;

public class A {

	int a;
	int b;
	
	A(){}
	
	A(int x,int y){
		
		a=x;
		b=y;
	}
	
	void m1(int x,int y) {
		a=x;
		b=y;
	}
	
	void updateA(int x) 
	{
		a=x;
	}
	
	void updateB(int y) {
		
		b=y;
	}
}
