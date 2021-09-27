
public class Threads_for_loop__3_objects extends Thread{

	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Name = "+Thread.currentThread().getName()+", Value of i = "+i);
			/*Thread.sleep(500);*/  //If I keep it like this there will be an error. IF YOU HOVER ON THIS LINE & CLICK ON SURROUND WITH TRY AND CATCH, DELAY WILL BE PUT BY TRY AND CATCH
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Threads_for_loop__3_objects t1 = new Threads_for_loop__3_objects();
		Threads_for_loop__3_objects t2 = new Threads_for_loop__3_objects();
		Threads_for_loop__3_objects t3 = new Threads_for_loop__3_objects();
		
		t1.start();
		t2.start();
		t3.start();
		//Random numbers will come because all Threads work together and the one executed first will run first
	}

}
