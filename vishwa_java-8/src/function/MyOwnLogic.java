package function;

public class MyOwnLogic {
	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i <= 10; i = i + 2) {
				System.out.println(i);
			}
		};
		Thread t = new Thread(r);
		t.start();
	}
}
