/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution2
 * Author:   think
 * Date:     2019/8/1 14:16
 * Description: 利用栈后进先出的性质解题
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject3;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈利用栈后进先出的性质解题〉
 *
 * @author think
 * @create 2019/8/1
 * @since 1.0.0
 */
public class Solution2 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        while (!stack.isEmpty()){
            arrayList.add(stack.pop());
        }
        return arrayList;
    }
}
