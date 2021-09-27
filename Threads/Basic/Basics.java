
public class Basics extends Thread{	//	NOTE:Thread is a predefined class from java which we are extending(inheriting)

	public void run() {
		System.out.println("Hello I m Thread, my name is: "+Thread.currentThread().getName());//Here we go in Thread() class then in currentThread() class and then we finally declare the class gatName()
	}
	
	public static void main(String[] args) {
		Basics obj = new Basics();
		obj.start();	//Starting of thread, NOTE:Don't write obj.run(); as run() is a different method for threads
		
		//Main method also works as a thread
		System.out.println("Main thread name is: "+Thread.currentThread().getName());
	}

}
