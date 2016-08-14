package book;

import java.util.Queue;
import java.util.Stack;

import javax.print.attribute.standard.RequestingUserName;

public class P5 {

	public static void main(String[] args) {
		TwoStackQueue<String> queue = new TwoStackQueue();
		queue.add("lys");
		System.out.println(queue.poll());
	}
}
/**
 * 用两个栈实现队列，支持队列的基本操作(add,poll,peek)
 * @author Administrator
 *
 * @param <T>
 */
class TwoStackQueue<T>{
	private Stack<T> stackPush;
	private Stack<T> stackPop;
	
	public TwoStackQueue() {
		this.stackPop = new Stack<>();
		this.stackPush = new Stack<>();
	}
	
	public void add(T data){
		stackPush.push(data);
		//原书中没有这一段，但是要加这一段才正确
		if(stackPop.empty())
			stackPop.push(data);
	}
	
	public T poll(){
		if(stackPop.empty() && stackPush.empty())
			throw new RuntimeException("Quene is empty");
		else if(stackPop.empty())
			while(!stackPop.empty())
				stackPop.push(stackPush.pop());
		return stackPop.pop();
	}
	
	public T peek(){
		if(stackPop.empty() && stackPush.empty())
			throw new RuntimeException("Quene is empty");
		else if(stackPop.empty())
			while(!stackPop.empty())
				stackPop.push(stackPush.pop());
		return stackPop.peek();
		
	}
}