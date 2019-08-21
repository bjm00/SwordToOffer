/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution1
 * Author:   think
 * Date:     2019/8/1 14:10
 * Description: 使用递归解法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject3;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈使用递归解法〉
 *
 * @author think
 * @create 2019/8/1
 * @since 1.0.0
 */
public class Solution1 {
    ArrayList<Integer> arrayList = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null){
            this.printListFromTailToHead(listNode.next);
            arrayList.add(listNode.val);
        }
        return arrayList;
    }
}
