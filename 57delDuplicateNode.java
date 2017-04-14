package org.fenixsoft.clazz;


public class TestClass {

	public static Node delDuplicateNode(Node head)
	{
		if(head == null)
		{
			return null;
		}
		Node p = null;
		Node q = head;
		Node r = head.m_pNext;
		while(r != null)
		{
			if(r.m_nValue != q.m_nValue)
			{
				if(q.m_pNext != r)
				{
					p.m_pNext = r;
					q = p;
				}
				p = q;
				q = r;
				r = r.m_pNext;
			}
			else
			{
				Node temp = r.m_pNext;
				if(temp == null)
				{
					if(q.m_nValue == r.m_nValue)
					{
						if(p != null)
						{
							p.m_pNext = null;
						}
						else
						{
							head = null;
						}
						
					}
				}
				r = null;
				r = temp;
			}
		}
		
		return head;
		
	}
	
	
	static class Node{
		int m_nValue;
		Node m_pNext;
	}

	public static void main(String[] args)
	{
		Node n1 = new Node();
		n1.m_nValue = 1;
		
		Node n2 = new Node();
		n2.m_nValue = 1;
		
		Node n3 = new Node();
		n3.m_nValue = 1;
		
		Node n31 = new Node();
		n31.m_nValue = 3;
		
		Node n32 = new Node();
		n32.m_nValue = 3;
		
		Node n4 = new Node();
		n4.m_nValue = 4;
		
		Node n41 = new Node();
		n41.m_nValue = 4;
		
		Node n5 = new Node();
		n5.m_nValue = 4;
		
		n1.m_pNext = n2;
		n2.m_pNext = n3;
//		n3.m_pNext = n31;
//		n31.m_pNext = n32;
//		n32.m_pNext = n4;
//		n4.m_pNext = n41;
//		n41.m_pNext = n5;
//		n5.m_pNext = null;
		
		Node p = n1;
		while(p != null)
		{
			System.out.print(p.m_nValue+"  ");
			p = p.m_pNext;
		}
		System.out.println();
		
		n1 = delDuplicateNode(n1);
		
		p = n1;
		while(p != null)
		{
			System.out.print(p.m_nValue+"  ");
			p = p.m_pNext;
		}
		System.out.println();
	}
	
	
}
