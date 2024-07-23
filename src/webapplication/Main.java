package webapplication;

public class Main {

		public static void main(String[] args) {
			MultiThreadWeb server = new MultiThreadWeb(5); 
	        server.start(); 

	        try {
	            Thread.sleep(1000); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        server.shutdown(); 
		}

	}

