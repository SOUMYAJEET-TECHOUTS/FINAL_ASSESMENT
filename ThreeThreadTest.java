package assessment;

public class ThreeThreadTest {

	public static void main(String[] args) {
	  
		        Thread[] threads = new Thread[3];
		        for (int i = 0; i < threads.length; i++) {
		            threads[i] = new Thread(new MyRunnable());
		        }
		        
		        
		        threads[0].setName("YourName");
		        threads[0].setDaemon(true);
		        
		     
		        for (Thread thread : threads) {
		            thread.start();
		        }
		        
		        
		        System.out.println("Details of all running threads:");
		        for (Thread thread : Thread.getAllStackTraces().keySet()) {
		            System.out.println("name: " + thread.getName());
		            System.out.println("Is daemon: " + thread.isDaemon());
		            System.out.println("Thread State: " + thread.getState());
		            System.out.println();
		        }
		    }
		    
		    static class MyRunnable implements Runnable {
		        @Override
		        public void run() {
		            System.out.println(Thread.currentThread().getName() + " started");
		            try {
		                Thread.sleep(1000); 
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		            System.out.println(Thread.currentThread().getName() + " ended");
		        }
		    }
		}


