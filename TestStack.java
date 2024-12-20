package collections;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		st.push(10);
		st.push(20);
		st.push(50);
		st.push(45);
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.empty());
	}

}
