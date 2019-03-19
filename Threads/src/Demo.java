

class MyClass extends Thread
{

	@Override
	public void run() {
		
		for(int i = 0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getId()+"Value: "+i);
			
		}
		try {
			Thread.sleep(100);
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
public class Demo {

	public static void main(String[] args) {

		MyClass myclass = new MyClass();
		
		//if you do .run it goes like normal application
		//if you do .start then it creates a thread
		//this call run automatically
		myclass.start();
		
		MyClass myclass1 = new MyClass();
		myclass1.start();
		
	}

}
