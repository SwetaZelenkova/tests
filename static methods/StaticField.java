
public class StaticField {
	
	public static int stat = 7;

	public static void main(String[] args) {
		
		StaticField st1 = new StaticField();
		StaticField st2 = new StaticField();
		System.out.println(" �� ���������: " + StaticField.stat);
		st1.stat = 999;
		System.out.println(" ����� 1 ���������: " + StaticField.stat + " ��� " + st2.stat);
		st2.stat = 333;
		System.out.println(" ����� 2 ���������: " + StaticField.stat + " ��� " + st1.stat);
		StaticField.stat = 1000;
		System.out.println(" ����� ���� ���������: " + StaticField.stat + " ��� " + st1.stat + " ��� " +  st2.stat);
	}

}
