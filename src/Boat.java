import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Boat implements Runnable{
	
	protected Box box [] = new Box[10];
	protected String name;
	protected int countThread;

	public Boat() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	public Boat(String name, int countThread) {
		super();
		this.name = name;
		for (int i = 0; i < box.length; i++) {
			box[i] = new Box(i+1);
		}
	}



	public Boat(Box[] box, String name) {
		super();
		this.box = box;
		this.name = name;
	}



//	public void ShipUnloading(){
//		for (Box box2 : box) {
//			System.out.println(name + "/box N" + box2.getNumber() + " Unload");
//		}
//	}
	
	public void run(){
		ExecutorService dock = Executors.newFixedThreadPool(countThread);
		dock.submit(new Boat());
		
		for (Box box2 : box) {
			System.out.println(name + "/box N" + box2.getNumber() + " Unload");
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dock.shutdown();
		
	}
	

	@Override
	public String toString() {
		return "Boat [boat=" + Arrays.toString(box) + "]";
	}

	
	
	
	
	
	

}
