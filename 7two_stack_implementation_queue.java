import java.util.*;
public class Queue<T> {
	Stack<T> stack1 = new Stack<T>();
	Stack<T> stack2 = new Stack<T>();
	//��stack1����룬��stack2��ɾ��
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
			//��stack1������Ԫ���ƶ���stack2
			while(!stack1.isEmpty())
			{
				stack2.push(stack1.pop());
			}
		}
		
		return stack2.pop();
	}
}
