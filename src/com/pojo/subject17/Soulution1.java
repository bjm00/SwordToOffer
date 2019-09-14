/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Soulution1
 * Author:   think
 * Date:     2019/9/9 22:07
 * Description: 思路相同，写法不同
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject17;

/**
 * 〈一句话功能简述〉<br> 
 * 〈思路相同，写法不同〉
 *
 * @author think
 * @create 2019/9/9
 * @since 1.0.0
 */
public class Soulution1 {

    public boolean HasSubtree(TreeNode root1,TreeNode root2){
        if (root1 == null || root2 == null){
            return false;
        }

        return isSubtree(root1,root2)||HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
    }

    public boolean isSubtree(TreeNode root1,TreeNode root2){
        if (root2 == null){
            return true;
        }

        if (root1 == null){
            return false;
        }

        if (root1.val == root2.val){
            return isSubtree(root1.left,root2.left)&&isSubtree(root1.right,root2.right);
        }else{
            return false;
        }
    }
}
