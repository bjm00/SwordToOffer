/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Test
 * Author:   think
 * Date:     2019/9/10 14:52
 * Description: 练习
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject17;

/**
 * 〈一句话功能简述〉<br> 
 * 〈练习〉
 *
 * @author think
 * @create 2019/9/10
 * @since 1.0.0
 */
public class Test {
    public boolean HasSubtree(TreeNode root1,TreeNode root2){
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


    public boolean isSubtree(TreeNode root1,TreeNode root2){
        if (root2 == null){
            return true;
        }

        if (root1 == null){
            return false;
        }

        if (root1.val != root2.val){
            return false;
        }

        return isSubtree(root1.left,root1.left)&&isSubtree(root1.right,root2.right);
    }
}
