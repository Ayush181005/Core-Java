
public class Basics2 implements Runnable{	//This will directly implement the runnable phase of threads

	public void run() {
		System.out.println("ID = "+Thread.currentThread().getId()+", Name = "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		Basics2 t = new Basics2();	//Object t declared to call the class
		Thread th = new Thread(t);	//Object th declared to call the class thread
		th.start();
	}

}
