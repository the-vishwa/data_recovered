package sonal_multithreading;

public class Thread  implements Runnable{
	Runnable r;
	Thread (){}
Thread (Runnable r){
	this .r=r;
}
public void run() {
	
}
void start() {
	if(r!=null) {
		r.run();
	}else {
		this .run();
	}   
}
}
