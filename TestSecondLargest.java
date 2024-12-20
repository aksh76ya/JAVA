package arrays;
public class TestSecondLargest {
	public int findSecondLargest(int[] arr) {
		int largest=Integer.MIN_VALUE;
		int secLargest=Integer.MIN_VALUE;
		for(int n : arr) {
			if(n > largest) {
				secLargest=largest;
				largest=n;
			}
			else if( n > secLargest && n != largest) {
				secLargest= n;
			}
		}
		return secLargest;
	}
	public static void main(String[] args) {
		
		int[] arr= {10, 28, 14, 22, 80};
		int seclar=new TestSecondLargest().findSecondLargest(arr);
		System.out.println("Second Lar="+ seclar);
	}

}
