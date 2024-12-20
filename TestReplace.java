package arrays;

public class TestReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello World";
		s=s.replace('l', 'm');
		System.out.println(s);
		
		String s1="Welcome to All";
		s1=s1.replaceAll("All", "Sathyabama");
		System.out.println(s1);
		
		String s2="Sathyabama";
		System.out.println(s2.contains("y"));
		System.out.println(s2.contains("x"));
	}

}
