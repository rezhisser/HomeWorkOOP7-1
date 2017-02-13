
public class Box {
	
	protected int number;

	public Box() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Box(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Box [number=" + number + "]";
	}
	
	

}
