package org.fenixsoft.clazz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TestClass {
	
	public static void getImageTree(BinaryTreeNode root)
	{
		if(root == null)
		{
			return;
		}
		
		Queue<BinaryTreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			BinaryTreeNode curr = queue.poll();
			if(curr.m_pLeft != null)
			{
				queue.add(curr.m_pLeft);
			}
			if(curr.m_pRight != null)
			{
				queue.add(curr.m_pRight);
			}
			
			BinaryTreeNode temp = curr.m_pLeft;
			curr.m_pLeft = curr.m_pRight;
			curr.m_pRight = temp;
		}
//		return root;
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
		
		BinaryTreeNode n6 = new BinaryTreeNode();
		n6.m_nValue = 6;
		n6.m_pLeft = null;
		n6.m_pRight = n7;
		
		BinaryTreeNode n10 = new BinaryTreeNode();
		n10.m_nValue = 10;
		n10.m_pLeft = n9;
		n10.m_pRight = null;
		
		
		BinaryTreeNode root = new BinaryTreeNode();
		root.m_nValue = 8;
		root.m_pLeft = null;
		root.m_pRight = null;
				
		getImageTree(null);
		System.out.println("end");
		
	}
	
	static class  BinaryTreeNode
	{
		int m_nValue;
		BinaryTreeNode m_pLeft;
		BinaryTreeNode m_pRight;
	}

}
