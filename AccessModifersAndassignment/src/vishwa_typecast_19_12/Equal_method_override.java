package vishwa_typecast_19_12;


class Man{
	int x;
	int y;
	
	
	@Override
	public boolean equals(Object obj) {
		Man m2 = (Man)obj;
		if (this.x==m2.x && this.y==m2.y) {
			return true;
		} return false;
	}
	
}
public class Equal_method_override {

	public static void main(String[] args) {
		Man m2 = new Man();
		m2.x=10;  m2.y=20;
		Man mm =new Man();
		mm.x=10;  mm.y=200;
		
		
		
		
		System.out.println("__________ 4 CASSES___________");	
		// case 1
		Man m1 =m2; // 2 ref point to one obj thats y true
		System.out.println(m1==m2); // true
		System.out.println(m1.equals(m2)); // true
		
		// case 2
		System.out.println(m2==mm); // false
		System.out.println(m2.equals(mm)); //true  if date are same otherwise false
		
		
		// case 3
		System.out.println(m2.equals(mm)); // true // matalb inka obj same hoga ya alag alag obj h
		// to data same hoga or euqal method override karke vaisa bz logic put kia hoga meyhod ke andar
		System.out.println(m2==mm);   // false or may b true if i want to print it true then i have to
		// take obj and thse 2 ref var point to that obj
		
		//case 4
	
		System.out.println(m2.equals(mm)); // false --  data are diffrnt  and this ref var ponting to 2 diff obj
		System.out.println(m2==mm);  
		
		
	}
	
}
