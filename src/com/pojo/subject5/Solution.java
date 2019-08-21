/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution
 * Author:   think
 * Date:     2019/8/5 9:26
 * Description: 剑指offer第五题
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject5;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 〈用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。〉<br>
 * 〈剑指offer第五题〉
 *
 * <分析>：
 *
 * 入队：将元素进栈A
 *
 * 出队：判断栈B是否为空，如果为空，则将栈A中所有元素pop，并push进栈B，栈B出栈；
 *
 *  如果不为空，栈B直接出栈。
 *
 * @author think
 * @create 2019/8/5
 * @since 1.0.0
 */
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.empty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }else {
            return stack2.pop();
        }
    }
}
