import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 1) ���������� ��� �������. �� ������ �� ��� 10 ������ �����.
��� ������������ ������� � ���� � ������� ������ ���
����. �������� ��������� 1 ���� � 0.5 ���. ��������
��������� ������� �������� ��������� �������� ��
��������� ���������� ����.
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
