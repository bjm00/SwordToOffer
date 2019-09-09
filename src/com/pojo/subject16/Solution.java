/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution
 * Author:   think
 * Date:     2019/9/1 16:32
 * Description: 合并两个排序链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject16;

/**
 * 〈一句话功能简述〉<br> 
 * 〈合并两个排序链表〉
 *
 * @author think
 * @create 2019/9/1
 * @since 1.0.0
 */
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {

        if (list1 == null){
            return list2;
        }

        if (list2 == null){
            return list1;
        }

        if (list1 == null && list2 == null){
            return null;
        }

        ListNode mergeHead = null,current = null;

        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                if (mergeHead == null){
                    mergeHead = current = list1;
                }else{
                    current.next = list1;
                    current = current.next;
                }
                list1 = list1.next;
            }else{
                if (mergeHead == null){
                    mergeHead = current = list2;
                }else{
                    current.next = list2;
                    current = current.next;
                }
                list2 = list2.next;
            }
        }

        if (list1 == null){
            current.next = list2;
        }else{
            current.next = list1;
        }

        return mergeHead;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
