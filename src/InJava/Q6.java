package InJava;

import java.util.List;

/**
 * @author liudongbo05 <liudongbo05@kuaishou.com>
 * Created on 2020-10-15
 */

//链表的原地反转
public class Q6 {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { this.val = x; }
		ListNode(){next=null;}
	}

	public static ListNode reversePrint(ListNode head) {
		ListNode tail = null;
		while(head != null){
			ListNode tmp = head.next;
			head.next = tail;
			tail = head;
			head = tmp;
		}
		return tail;
	}

	public  static  void main(String []agrs){
		ListNode head = new ListNode(1);
		ListNode pre = head;
		for (int i = 2; i < 5; i++) {
			ListNode now = new ListNode(i);
			pre.next = now;
			pre = now;
			now.next = null;
		}
		ListNode now = reversePrint(head);
		while (now != null){
			System.out.println(now.val);
			now = now.next;
		}
	}

}
