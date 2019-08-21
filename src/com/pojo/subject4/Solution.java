/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution
 * Author:   think
 * Date:     2019/8/2 11:42
 * Description: 剑指offer第四题
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject4;


import java.util.ArrayList;
import java.util.List;

/**
 * 〈重构二叉树，自己想的解法〉<br>
 * 〈剑指offer第四题
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字〉
 *
 * @author think
 * @create 2019/8/2
 * @since 1.0.0
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        ArrayList<Integer> preList = new ArrayList<>();
        ArrayList<Integer> inList = new ArrayList<>();
        for (int i : pre) {
            preList.add(i);
        }
        for (int i : in) {
            inList.add(i);
        }
        return getRootNode(preList,inList);
    }

    private TreeNode getRootNode(List<Integer> preList, List<Integer> inList){
        if (preList.size() == 0){
            return null;
        }

        int rootVal = preList.get(0);

        TreeNode treeNode = new TreeNode(rootVal);

        int index = inList.indexOf(rootVal);

        List<Integer> leftInTree = inList.subList(0,index);
        List<Integer> rightInTree = inList.subList(index + 1,inList.size());
        List<Integer> leftPreTree = preList.subList(1,leftInTree.size() + 1);
        List<Integer> rightPreTree = preList.subList(leftInTree.size() + 1,preList.size());

        treeNode.left = getRootNode(leftPreTree,leftInTree);
        treeNode.right = getRootNode(rightPreTree,rightInTree);
        return treeNode;
    }
}
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
