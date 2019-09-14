/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Test
 * Author:   think
 * Date:     2019/9/10 15:39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject18;

/**
 * 〈练习〉<br>
 * 〈〉
 *
 * @author think
 * @create 2019/9/10
 * @since 1.0.0
 */
public class Test {
    public void Mirror(TreeNode root) {
        if (root == null)
            return;

        TreeNode temp = null;

        temp = root.left;
        root.left = root.right;
        root.right = temp;

        if (root.left != null){
            Mirror(root.left);
        }

        if (root.right != null){
            Mirror(root.right);
        }
    }
}
