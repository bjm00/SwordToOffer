/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution
 * Author:   think
 * Date:     2019/9/12 11:24
 * Description: 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.sunject22;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈从上往下打印出二叉树的每个节点，同层节点从左至右打印。〉
 *  层序遍历
 * @author think
 * @create 2019/9/12
 * @since 1.0.0
 */
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<TreeNode> queue = new ArrayList<>();

        if (root == null){
            return list;
        }

        queue.add(root);
        while (queue.size() != 0){
            TreeNode temp = queue.remove(0);
            if (temp.left != null){
                queue.add(temp.left);
            }

            if (temp.right != null){
                queue.add(temp.right);
            }

            list.add(temp.val);

        }
        return list;
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }

}