package org.fenixsoft.clazz;

import java.util.Stack;

public class TestClass {

	
	public static void main(String[] args)
	{
		MinClass minClass = new MinClass();
//		minClass.pop();
//		minClass.min();
		
		minClass.push(5);
		System.out.println(minClass.min());//5
		minClass.push(1);
		minClass.push(3);
		System.out.println(minClass.min());//1
		minClass.push(0);
		minClass.push(6);
		System.out.println(minClass.min());//0
		
		minClass.pop();
		System.out.println(minClass.min());//0
		
		minClass.pop();
		System.out.println(minClass.min());//1
		
		minClass.pop();
		System.out.println(minClass.min());//1
		
		minClass.pop();
		System.out.println(minClass.min());//5

		
	}
	
    static class MinClass{
    	private Stack<Integer> stack1 = new Stack<>();
    	private Stack<Integer> stack2 = new Stack<>();
    	
    	public void push(int a)
    	{
    		stack1.push(a);
    		int min = a;
    		if(!stack2.isEmpty())
    		{
    			int temp = stack2.peek();
    			if(temp < min)
    			{
    				min = temp;
    			}
    		}	 
    		stack2.push(min);
    	}
    	
    	public int pop()
    	{
    		if(stack1.isEmpty())
    		{
    			throw new java.util.EmptyStackException();
    		}
    		stack2.pop();
    		return stack1.pop();
    	}
    	
    	public int min()
    	{
    		if(stack2.isEmpty())
    		{
    			throw new java.util.EmptyStackException();
    		}
    		return stack2.peek();
    	}
	}
	
	
}
