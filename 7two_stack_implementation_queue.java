import java.util.*;
public class Queue<T> {
	Stack<T> stack1 = new Stack<T>();
	Stack<T> stack2 = new Stack<T>();
	//往stack1里插入，从stack2里删除
	void appendTail(T node)
	{
		stack1.push(node);
	}
	T deleteHead()
	{
		if(stack2.isEmpty())
		{
			if(stack1.isEmpty())
			{
				return null;
			}
			//将stack1的所有元素移动到stack2
			while(!stack1.isEmpty())
			{
				stack2.push(stack1.pop());
			}
		}
		
		return stack2.pop();
	}
}
