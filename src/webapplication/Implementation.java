package webapplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class Implementation implements Runnable{
	private final int requestId;

    public Implementation(int requestId) {
        this.requestId = requestId;
    }
	
public int getRequestId() {
		return requestId;
	}

@Override
public void run() {
	 Thread.currentThread().setPriority(Thread.NORM_PRIORITY); 
        try {
            
            System.out.println("Handling request :" + requestId + " on thread " + Thread.currentThread().getName());
            
            Thread.sleep(2000); 
            System.out.println("Request :" + requestId + " processed");
        } catch (InterruptedException e) {
            
            System.out.println("Request :" + requestId + " was interrupted");
        } catch (Exception e) {
            
            System.out.println("An error occurred while processing request :" + requestId);
            e.printStackTrace();
        }
}



}
