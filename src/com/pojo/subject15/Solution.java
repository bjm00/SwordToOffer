/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution
 * Author:   think
 * Date:     2019/8/28 9:52
 * Description: 翻转链表，输出新链表的表头
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject15;

/**
 * 〈一句话功能简述〉<br> 
 * 〈翻转链表，输出新链表的表头〉
 *
 * @author think
 * @create 2019/8/28
 * @since 1.0.0
 */
public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode pre = null,next = null;

        while (head != null){
            next = head.next;
            head.next = pre;

            pre = head;
            head = next;
        }

        return pre;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
