/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution
 * Author:   think
 * Date:     2019/9/11 22:19
 * Description: 创建min函数的栈
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject20;

import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈创建min函数的栈〉
 *
 * @author think
 * @create 2019/9/11
 * @since 1.0.0
 */
public class Solution {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    public void push(int node) {
        stack.push(node);
        if (minStack.empty()){
            minStack.push(node);
        }else if (minStack.peek() < node){
            minStack.push(minStack.peek());
        }else if (minStack.peek() > node){
            minStack.push(node);
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
