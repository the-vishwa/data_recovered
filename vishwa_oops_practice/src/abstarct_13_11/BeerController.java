package abstarct_13_11;

public class BeerController {
	public static void main(String[] args) {
		BeerShop bs = new ShopImple();
		Customer c = new Customer();
		c.yourChoice(bs);

	}
}
