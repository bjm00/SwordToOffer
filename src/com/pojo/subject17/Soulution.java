/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Soulution
 * Author:   think
 * Date:     2019/9/9 21:22
 * Description: 输入两棵二叉树A，B，判断B是不是A的子结构
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject17;


/**
 * 〈一句话功能简述〉<br> 
 * 〈输入两棵二叉树A，B，判断B是不是A的子结构〉
 *  <>解题思路：分为两种情况，1种是在某个节点树1和树2的节点相等，那就从该节点往后遍历
 *  另一种是节点不相等那就往后遍历寻找有相等节点的地方</>
 * @author think
 * @create 2019/9/9
 * @since 1.0.0
 */
public class Soulution {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean result = false;

        if (root1 != null && root2 != null){
            if (root1.val == root2.val){
                result = isSubtree(root1,root2);
            }

            if (!result){
                result = HasSubtree(root1.left,root2);
            }

            if (!result){
                result = HasSubtree(root1.right,root2);
            }
        }

        return result;
    }

    public boolean isSubtree(TreeNode root1, TreeNode root2){
        if (root2 == null){
            return true;
        }

        if (root1 == null){
            return false;
        }

        if (root1.val != root2.val){
            return false;
        }

        return isSubtree(root1.left,root2.left)&&isSubtree(root1.right,root2.right);
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