package book;

import java.util.Stack;

public class P13 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(2);
		stack.push(4);
		stack.push(5);
		stack.push(1);
		stack.push(7);
		stack.push(1);
		
		sortStackByStack(stack);
		while(!stack.empty()){
			System.out.println(stack.pop());
		}
	}
	/**
	 * 将stack从顶到底按从大到小的顺序排序
	 * @param stack
	 */
	public static void sortStackByStack(Stack<Integer> stack){
		Stack<Integer> help = new Stack<>();
		while(!stack.empty()){
			Integer cur = stack.pop();
			if(help.isEmpty() || help.peek() < cur)
				help.push(cur);
			else{
				while(help.peek() > cur){
					stack.push(help.pop());
				}
				help.push(cur);
			}
		}
		
		while(!help.empty()){
			stack.push(help.pop());
		}
	}
}

