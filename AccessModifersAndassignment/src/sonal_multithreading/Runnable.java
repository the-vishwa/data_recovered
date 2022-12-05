package sonal_multithreading;

public interface Runnable {
void run();
}
class job implements Runnable{
	
	@Override
	 public void run() {
		System.out.print("i am child method");
	}
}