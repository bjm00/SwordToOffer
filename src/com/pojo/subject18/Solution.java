/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution
 * Author:   think
 * Date:     2019/9/9 22:27
 * Description: 操作给定的二叉树，将其变换为源二叉树的镜像。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject18;



/**
 * 〈一句话功能简述〉<br> 
 * 〈操作给定的二叉树，将其变换为源二叉树的镜像。〉
 *  思路:
 * @author think
 * @create 2019/9/9
 * @since 1.0.0
 */
public class Solution {
    public void Mirror(TreeNode root) {

        TreeNode temp = null;
        if (root == null){
            return;
        }
        if (root!=null){
        temp = root.left;
        root.left = root.right;
        root.right = temp;

            if (root.left != null){
            Mirror(root.right);
        }

            if (root.right != null){
            Mirror(root.left);
        }
        }

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