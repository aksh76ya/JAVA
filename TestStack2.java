package collections;

import java.util.Stack;
// traversing using java.util.Stack.empty()
public class TestStack2 {
public static void main(String[] args) {
	Stack<String> st=new Stack<>();
	st.push("Hello");
	st.push("Good");
	st.push("Afternoon");
	
	while(!st.empty()) {
		System.out.print(st.pop()+"\t");
	}
}
}
