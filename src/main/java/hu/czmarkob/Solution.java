package hu.czmarkob;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Solution {

	List<String> operators = Arrays.asList("+", "-", "*", "/");

	public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<>();
		for ( String token : tokens ) {
			if ( isOperator(token) ) {
				int b = stack.pop();
				int a = stack.pop();
				stack.push(doCalculation(a, b, token));
			} else {
				stack.push(Integer.parseInt(token));
			}
		}

		return stack.pop();
	}

	private boolean isOperator(String s) {
		return operators.contains(s);
	}

	private int doCalculation(int a, int b, String operator) {
		if ("*".equals(operator)) {
			return a * b;
		} else if ("+".equals(operator)) {
			return a + b;
		} else if ("-".equals(operator)) {
			return a - b;
		} else {
			return a / b;
		}
	}
}
