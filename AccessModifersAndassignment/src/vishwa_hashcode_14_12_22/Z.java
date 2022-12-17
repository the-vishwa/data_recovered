package vishwa_hashcode_14_12_22;

class Mmm {
	int a;
	Mmm(){
		
	}
	
	@Override
	public int hashCode() {
		return this.a;
	}
	@Override
	public String toString() {

		return "rwl";
    // return "ans=" +this.a ;
	}
}
public class Z {
	public static void main(String[] args) {
		
String s1 = new String("abc"); // data value
String s2 = new String("abc"); // data value

System.out.println(s1);
System.out.println(s2);
System.out.println(s1.hashCode());
System.out.println(s2.hashCode());

Mmm m = new Mmm();
Mmm m2 = new Mmm();

System.out.println(m);
System.out.println(m.a);
System.out.println(m.hashCode());
System.out.println(m2.hashCode());
	}
}
