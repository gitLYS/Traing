package book;

import java.util.Stack;

public class P8<T> {
	/**
	 * 将栈底的元素返回并移除
	 * @param stack
	 * @return
	 */
	public static Integer getAndRemoveLastElement(Stack<Integer> stack){
		int result = stack.pop();
		if(stack.empty())
			return result;
		else{
			int last = getAndRemoveLastElement(stack);
			stack.push(result);
			return last;
		}
	}
	/**
	 * 逆序一个栈
	 * @param stack
	 */
	public static void reverse(Stack<Integer> stack){
		if(stack.empty())
			return;
		int i = getAndRemoveLastElement(stack);
		reverse(stack);
		stack.push(i);
	}
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		reverse(stack);
		System.out.println(getAndRemoveLastElement(stack));
	}
}


