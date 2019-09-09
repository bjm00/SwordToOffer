/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution
 * Author:   think
 * Date:     2019/8/27 19:01
 * Description: 输出链表中倒数K个节点
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject14;

import java.util.ArrayList;

/**
 * 〈双指针方法〉<br>
 * 〈输出链表中倒数K个节点〉
 *
 * @author think
 * @create 2019/8/27
 * @since 1.0.0
 */
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        int count = 0,index = k;
        ListNode pNode = head, pre = head;

        while (pre != null){
            pre = pre.next;
            if (k < 1){
                pNode = pNode.next;
            }
            count++;
            k--;
        }
        if (count < index)
            return null;
        return pNode;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
