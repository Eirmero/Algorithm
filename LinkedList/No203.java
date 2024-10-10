package com.LinkedList;

public class No203 {
    public static void main(String[] args) {

    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }
        return dummy.next;
    }
}

//最基础的链表题 怎么移除链表中的元素
//链表返回 输入什么 输入返回head就行
//在当前的代码中，current.next.next 为 null 的情况是可以处理的，不会导致异常
// 原因是即使 current.next.next 为 null，赋值操作 current.next = current.next.next
// 仍然是有效的，因为它只是把 current.next 指向 null，不会引发异常

//仔细感受这个dummy的用法