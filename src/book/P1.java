package book;

import java.util.Stack;


public class P1 {

}

/**
 * 实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作
 * @author liuyushuang
 *
 */
class MyStack1 {
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;

	public MyStack1() {
		this.stackData = new Stack<>();
		this.stackMin = new Stack<>();
	}

	public void push(Integer newNum) {
		this.stackData.push(newNum);

		if (this.stackMin.isEmpty()) {
			this.stackMin.push(newNum);
		} else if (newNum < this.getMin()) {
			this.stackMin.push(newNum);
		}
	}

	public Integer pop() {
		if (this.stackData.isEmpty()) {
			throw new RuntimeException("this stack is empty");
		}
		Integer value = this.stackData.pop();
		if (value == this.getMin())
			this.stackMin.pop();
		return value;
	}

	public Integer getMin() {
		if (this.stackMin.isEmpty()) {
			throw new RuntimeException("this stack is empty!");
		}
		return this.stackMin.peek();
	}
}



