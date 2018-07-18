
public class A {
	
    private int a;
    
    private A(int a) {
    	this.a = a;
    }
    
	public static void main(String[] args) {
		
		System.out.println(A.staticMethod(11));
		System.out.println(new A(5).nonStaticMethod(33));

	}
	
	private static int staticMethod(int n) {
		return n + 10000;
	}
	
	private int nonStaticMethod(int n) {
		return n + 10000 + a;
	}
}
