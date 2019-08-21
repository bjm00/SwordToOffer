/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution
 * Author:   think
 * Date:     2019/8/1 13:06
 * Description: 剑指offer第三题
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 〈输入一个链表，按链表值从尾到头的顺序返回一个ArrayList
 *  自己想到的：将链表中元素放入ArrayList，使用Collections的reverse方法倒转ArrayList〉<br>
 * 〈剑指offer第三题〉
 *
 * @author think
 * @create 2019/8/1
 * @since 1.0.0
 */
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        //ListNode listNode1 = new ListNode();
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (listNode != null){
            arrayList.add(listNode.val);
            listNode = listNode.next;
        }
        Collections.reverse(arrayList);
        return arrayList;
    }
}


     class ListNode {
         int val;
         ListNode next = null;

         ListNode(int val) {
             this.val = val;
         }
     }

