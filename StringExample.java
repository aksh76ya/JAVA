package arrays;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		str=str.concat("All");
		System.out.println(str);
		System.out.println(str.charAt(4));
		//str.concat(str)
		System.out.println(str.indexOf('A'));
		System.out.println(str.indexOf('l'));
		System.out.println(str.lastIndexOf('l'));
		str.toCharArray(): char[];
		str.toLowerCase(); str.toUpperCase();
		str.trim();
		str.isEmpty();
		
	}

}
