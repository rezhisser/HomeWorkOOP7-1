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
		
		
		
		Boat boatOne = new Boat("boatOne", 2);
		Boat boatTwo = new Boat("boatTwo", 2);
		Boat boatTree = new Boat("boatTree", 2);
		
		boatOne.run();
		boatTwo.run();
		boatTree.run();
		
	
		

	}

}
