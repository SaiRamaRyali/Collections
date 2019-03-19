class Myclasses implements Runnable
{

	@Override
	public void run() {
		for(int i = 0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getId()+"Value: "+i);
			
		}
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
public class DemoThred {

	public static void main(String[] args) {

		Thread t1 = new Thread (new Myclasses());
		Thread t2 = new Thread (new Myclasses());
		t1.start();
		t2.start();

	}

}
