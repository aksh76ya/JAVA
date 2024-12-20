package oops;

public class StaticTest {
	int nonstavar=0;
	static int stavar;
	static {
		stavar=10;
		System.out.println("before main method");
	}
	public StaticTest() {
	nonstavar++;
	stavar++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticTest.stavar);
		StaticTest st=new StaticTest();
		System.out.println("Non Static "+st.nonstavar);
		System.out.println("For static "+StaticTest.stavar);
		StaticTest st1=new StaticTest();
		System.out.println("Non Static "+st1.nonstavar);
		System.out.println("For static "+StaticTest.stavar);
	}
}
