package Modifiers;

public class AccessModifier {
	private int a=10;
	public int b=12;
	protected int c=28;
	int d=20;
	
	private void a() {
		System.out.println("public");
		
	}
	public void b() {
		System.out.println("private");
	}
	protected void c() {
	    System.out.println("protected");	
		
	}
	 void d() {
		System.out.println("default");
	}
	
	

	public static void main(String[]args) {
		AccessModifier s= new AccessModifier();
		s.a();
		s.b();
		s.c();
		s.d();
		
}
	

}
