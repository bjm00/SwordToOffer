/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution
 * Author:   think
 * Date:     2019/9/12 10:54
 * Description: 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject21;

import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。〉
 *
 * @author think
 * @create 2019/9/12
 * @since 1.0.0
 */
public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA.length == 0|| popA.length == 0|| pushA.length != popA.length){
            return false;
        }
        int j = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);

            while (!stack.isEmpty()&&stack.peek()==popA[j]){
                stack.pop();
                j++;
            }
        }

        if (stack.isEmpty())
            return true;
        else return false;
    }
}
