package sonal_multithreading;

public class controller {

	public static void main(String[]args) {
		
	
		System.out.println(" i am main  method");
		
	//	Thread thread = new Thread();
		//thread.start();
		
		Runnable r=new job();
			Thread thread1 = new Thread(r);
			thread1.start();
		
	}
	
}
