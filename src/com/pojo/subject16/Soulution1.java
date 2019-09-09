/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Soulution1
 * Author:   think
 * Date:     2019/9/1 18:47
 * Description: 递归解法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject16;

/**
 * 〈合并两个排序链表〉<br>
 * 〈递归解法〉
 *
 * @author think
 * @create 2019/9/1
 * @since 1.0.0
 */
public class Soulution1 {
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

        ListNode mergeHead = null;
        if (list1.val <= list2.val){
            mergeHead = list1;
            mergeHead.next = Merge(list1.next,list2);
        }else{
            mergeHead = list2;
            mergeHead.next = Merge(list1,list2.next);
        }

        return mergeHead;
    }
}
