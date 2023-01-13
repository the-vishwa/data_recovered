package vishwa_9_1_23;

import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.Iterator;

public class Curser {
public static void main(String[] args) {
	ArrayList<Product> al = new ArrayList<Product>();
	Product p = new Product(1,"mobile","electronic",15000);
	Product p1 = new Product(2,"book","study material",150);
	Product p2 = new Product(3,"TV","electronic",150000);
	Product p3 = new Product(4,"Freeze","electronic",25000);
	
	al.add( new Product(1,"mobile","electronic",15000));
	al.add( new Product(2,"book","study material",150));
	al.add( new Product(3,"TV","electronic",150000));
	al.add( new Product(4,"Freeze","electronic",25000));
	
	Iterator<Product> itr = al.iterator();
	while(itr.hasNext()) {
		Product cc = itr.next();
		System.out.println(cc);
	}
	
}
}
