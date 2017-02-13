import java.util.Arrays;

public class Boat implements Runnable{
	
	protected Box box [] = new Box[10];
	protected String name;

	public Boat() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	public Boat(String name) {
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



	public void ShipUnloading(){
		for (Box box2 : box) {
			System.out.println(name + "/box N" + box2.getNumber() + " Unload");
		}
	}
	
	public void run(){
		
		ShipUnloading();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

	@Override
	public String toString() {
		return "Boat [boat=" + Arrays.toString(box) + "]";
	}
	
	
	
	
	
	

}
