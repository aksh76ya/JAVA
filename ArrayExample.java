package arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] marks=new float[10];
		float m=100;
		for(int i=0; i < marks.length; i++) {
			marks[i]= m++;
		}
		for(float f:marks) {
			System.out.print(f+ "\t");
		}
	}

}
