import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 1) —уществуют три корабл€. Ќа каждом из них 10 €щиков груза.
ќни одновременно прибыли в порт в котором только два
дока. —корость разгрузки 1 €щик в 0.5 сек. Ќапишите
программу котора€ управл€€ корабл€ми позволит им
правильно разгрузить груз.
		 */
		
		
		
		Boat boatOne = new Boat("boatOne");
		Boat boatTwo = new Boat("boatTwo");
		Boat boatTree = new Boat("boatTree");
		
		ExecutorService dock = Executors.newFixedThreadPool(2);
		
		dock.submit(boatOne);
		dock.submit(boatTwo);
		dock.submit(boatTree);
		
		dock.shutdown();
		
	
		

	}

}
