package assessment;

import java.util.concurrent.CountDownLatch;


public class ThreadTest {

	public static void main(String[] args) {
		
		        CountDownLatch latch = new CountDownLatch(2);


		        ResultHolder resultHolder = new ResultHolder();


		        Thread addThread = new Thread(new AddOperation(latch, resultHolder));
		        Thread avgThread = new Thread(new AvgOperation(latch, resultHolder));
		        Thread displayThread = new Thread(new DisplayOperation(resultHolder));
		        
		       
		        addThread.start();
		        avgThread.start();
		        
		        try {
		           
		            latch.await();
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		        
		     
		        displayThread.start();
		    }
		}

		
		class ResultHolder {
		    private int sum;
		    private int count;

		    public synchronized void addToSum(int value) {
		        sum += value;
		        count++;
		    }

		    public synchronized int getSum() {
		        return sum;
		    }

		    public synchronized double getAverage() {
		        if (count == 0) {
		            return 0.0;
		        }
		        return (double) sum / count;
		    }
		}

		
		class AddOperation implements Runnable {
		    private CountDownLatch latch;
		    private ResultHolder resultHolder;

		    public AddOperation(CountDownLatch latch, ResultHolder resultHolder) {
		        this.latch = latch;
		        this.resultHolder = resultHolder;
		    }

		    @Override
		    public void run() {
		       
		        for (int i = 1; i <= 100; i++) {
		            resultHolder.addToSum(i);
		            try {
		                Thread.sleep(100); 
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		        }
		        latch.countDown(); 
		    }
		}

		class AvgOperation implements Runnable {
		    private CountDownLatch latch;
		    private ResultHolder resultHolder;

		    public AvgOperation(CountDownLatch latch, ResultHolder resultHolder) {
		        this.latch = latch;
		        this.resultHolder = resultHolder;
		    }

		    @Override
		    public void run() {
		        
		        try {
		            Thread.sleep(500); 
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		        latch.countDown(); 
		    }
		}

		class DisplayOperation implements Runnable {
		    private ResultHolder resultHolder;

		    public DisplayOperation(ResultHolder resultHolder) {
		        this.resultHolder = resultHolder;
		    }

		    @Override
		    public void run() {
		        
		        while (resultHolder.getSum() == 0 || resultHolder.getAverage() == 0.0) {
		            try {
		                Thread.sleep(100); 
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		        }

		        
		        System.out.println("Sum: " + resultHolder.getSum());
		        System.out.println("Average: " + resultHolder.getAverage());
		    }
		
	}

