package assessment;

public class ThreadStatesTest {

	public static void main(String[] args) throws InterruptedException {

		        Thread thread = new Thread(() -> {
		            System.out.println("Thread running");
		            try {
		                Thread.sleep(2000); 
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		            System.out.println("Thread completed");
		        });

		        
		        System.out.println("Thread state just after creation: " + thread.getState());

		     
		        thread.start();

		        Thread.sleep(500);

		        System.out.println("Thread state after starting: " + thread.getState());

		        thread.join();

		        System.out.println("Thread state after joining: " + thread.getState());
		    }
		
	}


