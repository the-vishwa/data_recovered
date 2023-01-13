package vishwa_9_1_23;

import java.util.ArrayList;

public class ProductController {
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
	// for loop
	for(int i =0; i<al.size();i++) {
		Product rr =al.get(i);
		//System.out.println(rr);
	}
	// while loop
	int j= 0;
	while(j<al.size()) {
		Product ss = al.get(j);
		//System.out.println(ss);
		j++;
	}
	// foreach loop
	for (Product pp : al) {
		System.out.println(pp);
	}
	
	
}
}
