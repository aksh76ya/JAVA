package oops;

public class StudentData {
	int roll=100;
	String name="Haresh";
	@Override
	public String toString() {
		
		return "Roll-"+ roll+" Name-"+ name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentData sd=new StudentData();
		System.out.println(sd.toString());
		/*
		 * String str=new String("Hello"); System.out.println(str);
		 */
	}

}
