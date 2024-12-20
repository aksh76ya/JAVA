package arrays;

public class TestRevArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {11, 22, 33, 44, 55};
		int temp;
		int first=0;
		int last=arr.length - 1;
		while(first < last) {
			temp=arr[first];
			arr[first]= arr[last];
			arr[last]= temp;
			first++;
			last--;
		}
		System.out.println("Reverse Array");
		for(int i : arr) {
			System.out.print(i+ " ");
		}
	}

}
