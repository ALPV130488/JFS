package multithreading;

public class MultithreadingEx implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("childthread");
		}

	}

	public static void main(String[] args) {
		
		MultithreadingEx obj =new MultithreadingEx();
		
		Thread thread = new Thread(obj);
		
		thread.start();
		
		for(int i =0;i<10;i++) {
		
		System.out.println("mainthread");}
		

	}

}
