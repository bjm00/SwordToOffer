/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution1
 * Author:   think
 * Date:     2019/8/5 10:01
 * Description: 解法2
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject5;

import java.util.Stack;

/**
 *〈解法2〉
 * 每次psuh是时先将stack2清空放入stck1(保证选入的一定在栈底)，stack2始终是用来删除的
 * 在pop前，先将stack1中中的数据清空放入stack2（保存后入的在栈底），stack1始终用于push〉<br>
 *
 * @author think
 * @create 2019/8/5
 * @since 1.0.0
 */
public class Solution1 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
