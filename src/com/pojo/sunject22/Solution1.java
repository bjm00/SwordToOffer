/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution1
 * Author:   think
 * Date:     2019/9/14 22:45
 * Description: 使用优先队列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.sunject22;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 〈一句话功能简述〉<br> 
 * 〈使用优先队列〉
 *
 * @author think
 * @create 2019/9/14
 * @since 1.0.0
 */
public class Solution1 {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> nodes = new LinkedList<>();
        if (root == null){
            return list;
        }

        nodes.offer(root);
        while (nodes.size()!=0){
            TreeNode temp = nodes.poll();
            list.add(temp.val);
            if (temp.left != null){
                nodes.offer(temp.left);
            }

            if (temp.right != null){
                nodes.offer(temp.right);
            }
        }

        return list;
    }
}
