package exceptions;

public class Swap2Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Sathyabama";
		String s2="University";
		System.out.println("Before swap");
		System.out.println(s1+ " "+s2);
		s1=s1 + s2; // s1= s1.concat(s2);
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("After swap");
		System.out.println(s1 + " "+ s2);
	}

}
