package hu.czmarkob;

public class Main {
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.evalRPN(new String[] {"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
	}
}