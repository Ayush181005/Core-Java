
public class Threads_Two implements Runnable{

	public void run() {
		System.out.println("ID = "+Thread.currentThread().getId()+", Name = "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		Threads_Two t1 = new Threads_Two();
		Thread th1 = new Thread(t1);
		
		Thread th2 = new Thread(t1);
		
		th1.start();
		th2.start();
	}

}
