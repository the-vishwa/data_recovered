package collection_api.list.array.list.opt;

import java.util.ArrayList;
import java.util.Iterator;

import vishwa_9_1_23.Product;

public class SerchGivenProdutDeatisl {

	public static Product getproduct(String productName, ArrayList<Product> list) {

//		for (Product product : list) {
//			if (productName.equals(product.getProductName())) {
//				return product;
//			}
//		}

		Iterator<Product> itr = list.iterator();
		while (itr.hasNext()) {
			Product p = itr.next();
			if (p.getProductName().equals(productName)) {
				return p;
			}

		}

		return null;
	}

	public static void main(String[] args) {

		ArrayList<Product> al = new ArrayList<Product>();
		// size 4 >> valid index range 0 - 3
		al.add(new Product(1, "TV", "electronic", 100000));
		al.add(new Product(2, "pen", "study material", 500));
		al.add(new Product(3, "pen", "study material", 500));
		al.add(new Product(4, "mobile", "electronic", 50000));
		al.add(new Product(5, "notebook", "study matrial", 50));

		// name = mobile >>> need full object

		Product p = getproduct("pen", al);
		System.out.println(p);

	}

}
