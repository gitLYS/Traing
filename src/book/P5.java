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
 * ������ջʵ�ֶ��У�֧�ֶ��еĻ�������(add,poll,peek)
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
		//ԭ����û����һ�Σ�����Ҫ����һ�β���ȷ
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