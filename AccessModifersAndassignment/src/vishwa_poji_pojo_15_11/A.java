package vishwa_poji_pojo_15_11;
// poji poji is a one design pattrn
interface A {
void  sum (int a,int b); // poji
}
class B implements A{
	public void sum(int a, int b) { // pojo
		int c =a+b;
		System.out.println(c);
	}
}
class C implements A{
	public void sum(int a, int b) {
		System.out.println(a-b);
	}
	
}
