package org.fenixsoft.clazz;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestClass {
	private static Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();

	public static void printFromTopToBottom(BinaryTreeNode root)
	{
		if(root == null)
		{
			return;
		}
		queue.add(root);
		while(!queue.isEmpty())
		{
			BinaryTreeNode temp = queue.remove();
			if(temp.m_pLeft != null)
			{
				queue.add(temp.m_pLeft);
			}
			if(temp.m_pRight != null)
			{
				queue.add(temp.m_pRight);
			}
			System.out.print(temp.m_nValue+"  ");
		}
		
		System.out.println();
	}
	
	static class BinaryTreeNode{
		int m_nValue;
		BinaryTreeNode m_pLeft;
		BinaryTreeNode m_pRight;
	}

	public static void main(String[] args)
	{
		BinaryTreeNode n5 = new BinaryTreeNode();
		n5.m_nValue = 5;
		n5.m_pLeft = null;
		n5.m_pRight = null;
		
		BinaryTreeNode n7 = new BinaryTreeNode();
		n7.m_nValue = 7;
		n7.m_pLeft = null;
		n7.m_pRight = null;
		
		BinaryTreeNode n9 = new BinaryTreeNode();
		n9.m_nValue = 9;
		n9.m_pLeft = null;
		n9.m_pRight = null;
		
		BinaryTreeNode n11 = new BinaryTreeNode();
		n11.m_nValue = 11;
		n11.m_pLeft = null;
		n11.m_pRight = null;
		
		BinaryTreeNode n6 = new BinaryTreeNode();
		n6.m_nValue = 6;
		n6.m_pLeft = n5;
		n6.m_pRight = n7;
		
		BinaryTreeNode n10 = new BinaryTreeNode();
		n10.m_nValue = 10;
		n10.m_pLeft = n9;
		n10.m_pRight = n11;
		
		BinaryTreeNode n8 = new BinaryTreeNode();
		n8.m_nValue = 8;
		n8.m_pLeft = n6;
		n8.m_pRight = n10;
		
		printFromTopToBottom(n8);
		
	}
	
	
}
