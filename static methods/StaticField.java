
public class StaticField {
	
	public static int stat = 7;

	public static void main(String[] args) {
		
		StaticField st1 = new StaticField();
		StaticField st2 = new StaticField();
		System.out.println(" До изменений: " + StaticField.stat);
		st1.stat = 999;
		System.out.println(" После 1 изменений: " + StaticField.stat + " или " + st2.stat);
		st2.stat = 333;
		System.out.println(" После 2 изменений: " + StaticField.stat + " или " + st1.stat);
		StaticField.stat = 1000;
		System.out.println(" После всех изменений: " + StaticField.stat + " или " + st1.stat + " или " +  st2.stat);
	}

}
