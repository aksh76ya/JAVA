package arrays;

public class TestLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10, 20, 13, 14, 55};
		int largest=arr[0];
		for(int i : arr) {
			if(i > largest)
				largest=i;			
		}
		System.out.println("Largest "+ largest);
	}

}
