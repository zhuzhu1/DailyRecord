import java.util.*;
public class One{
    public static class ListNode
    {
        int value;
        ListNode next;
        public ListNode(int value)
        {
            this.value = value;
            next = null;
        }
    }
    //消耗空间
    public static void printTailtoHead(List<Integer> list)
    {
        if(list == null || list.size() <= 0)
        {
            return;
        }
        List<Integer> temp_arr = new ArrayList<Integer>();
        Iterator it = list.iterator();
        while(it.hasNext())
        {
            temp_arr.add((Integer)it.next());
        }
        for(int i = temp_arr.size()-1; i >= 0; i--)
        {
            System.out.print(temp_arr.get(i)+" ");
        }
        System.out.println();
    }
    //消耗时间
    public static void printTailtoHead2(List<Integer> list)
    {   
        if(list == null || list.size() <= 0)
        {
            return;
        }
        Collections.reverse(list);
        Iterator it = list.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
    }
    //消耗空间
    public static void printTailtoHead3(ListNode node)
    {
        if(node == null)
        {
            return;
        }
        List<Integer> temp_arr = new ArrayList<Integer>();
        while(node != null)
        {
            temp_arr.add(node.value);
            node = node.next;
        }
        
        for(int i = temp_arr.size()-1; i >= 0; i--)
        {
            System.out.print(temp_arr.get(i)+" ");
        }
        System.out.println();
    }
    //消耗时间
    public static void printTailtoHead4(ListNode node)
    {
        if(node == null)
        {
            return;
        }
        ListNode p = node;
        if(p.next == null)
        {
            System.out.println(p.value);
            return;
        }
        ListNode q = p.next;
        if(q.next == null)
        {
            System.out.print(q.value+" "+p.value);
            System.out.println();
            return;
        }
        ListNode r = q.next;
        p.next = null;
        while(q != null)
        {
            q.next = p;
            p = q;
            q= r;
            if(r != null)
            {
                r = r.next;
            }
        }
        ListNode temp = p;
        while(temp != null)
        {
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    //通常打印是一个只读操作，不希望我们打印时修改内容，所以消耗时间的两个函数不可取
    //书上建议用栈实现，但是感觉和用arraylist相比，没有多少优势
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        printTailtoHead(list);
        printTailtoHead2(list);
        
        printTailtoHead3(null);
        printTailtoHead4(null);
        
        ListNode node1 = new ListNode(2);
        printTailtoHead3(node1);
        printTailtoHead4(node1);
        
        ListNode node2 = new ListNode(4);
        node1.next = node2;
        printTailtoHead3(node1);
        printTailtoHead4(node1);
        
        ListNode node3 = new ListNode(6);
        node2.next = node3;
        printTailtoHead3(node1);
        printTailtoHead4(node1);
        
        node1.next = node2;
        node2.next = node3;
        ListNode node4 = new ListNode(8);
        node3.next = node4;
        printTailtoHead3(node1);
        printTailtoHead4(node1);
    }

}
