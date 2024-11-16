package packageA;

import java.util.Stack;

public class StackOperation {

	public static boolean validParanthesisCheck(String s) {
//		boolean flag = false;
//		Stack<Character> stack = new Stack<>();
//		for (int i = 0; i < st.length(); i++) {
//			if (st.charAt(i) == '{' && i<st.length()-1) {
//				stack.push('{');
//			} else if (st.charAt(i) == '(' && i<st.length()-1) {
//				stack.push('(');
//			} else if (st.charAt(i) == '['&& i<st.length()-1) {
//				stack.push('[');
//			}
//			else if (stack.isEmpty()) {
//				flag = false;
//			}
//			else if (isMatchingPair(st.charAt(i), stack.peek())) {
//				stack.pop();
//				flag = true;
//			} else {
//				flag = false;
//				break;
//
//			}
//		}
//		return stack.isEmpty();
		
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else {

				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.peek();
				if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
        return stack.isEmpty();
		
		
		
	}

	private static boolean isMatchingPair(char c, Character peek) {

		if ((c == ')' && peek == '(') || (c == '}' && peek == '{') || (c == ']' && peek == '['))

			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		String st = "{]}"; // },),

		// char[] braces = st.toCharArray();
		boolean res = StackOperation.validParanthesisCheck(st);
		System.out.println(res);

	}
}
