
public class Demo2 {

	public static int count = 0;
	
	
	//method has synchronized
	//every obj has sync lock
	//access is locked until it does its function is complete
	//ones functio is complete by thread then other thread will access it
	//lock it complete its function
	
	//-----Synchronized---
	//all above done by keyword Synchronized
	public static synchronized void inccount()
	{
		count++;
	}
	public static void main(String[] args) throws InterruptedException {

		
		Thread t1 = new Thread(new Runnable()
		{

			@Override
			public void run() {
				for(int i = 0;i<10000;i++)
				{
					inccount();
				}
				
			}
			
		});
		
		Thread t2 = new Thread(new Runnable()
		{

			@Override
			public void run() {
				for(int i = 0;i<10000;i++)
				{
					inccount();
				}
				
			}
			
		});
		
		t1.start();
		t2.start();
		//wont wait till the threads are complete
		//start wont wait till the threads are dead
		//it directly print the value
		//to overcome this we go with JOIN
		//join will allow the thread to complete
		//and allow the thread after that
		t1.join();
		t2.join();
		//we dont get 20000
		//as increment is long process to computer
		//one thread will access this other thread will losse it
		//to over come this key word is Synchronize
		
		System.out.println("value : "+count);
	}

}
