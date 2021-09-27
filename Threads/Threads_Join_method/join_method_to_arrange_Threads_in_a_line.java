
public class join_method_to_arrange_Threads_in_a_line extends Thread{

	public void run() {
		for(int i = 0; i <= 5; i++) {
			System.out.println("Name = "+Thread.currentThread().getName()+", value of i = "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		join_method_to_arrange_Threads_in_a_line t1 = new join_method_to_arrange_Threads_in_a_line();
		join_method_to_arrange_Threads_in_a_line t2 = new join_method_to_arrange_Threads_in_a_line();
		join_method_to_arrange_Threads_in_a_line t3 = new join_method_to_arrange_Threads_in_a_line();
		
		t1.setName("Ayush1"); //It will set the name of the Thread
		t1.setPriority(MAX_PRIORITY);	//MAX_PRIORITY = 10, MID_PRIORITY = 5, MIN_PRIORITY = 1
		t1.start();
		try {
			t1.join();	//Join method will execute this code first and then the other two Threads will run
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.setName("Ayush2");
		t2.setPriority(5);	//Here we can either write MID_PRIORITY or 5 both are same
		t2.start();
		
		t3.setName("Ayush3");
		t3.setPriority(1);	//Here we can either write MIN_PRIORITY or 1 both are same
		t3.start();
	}

}
