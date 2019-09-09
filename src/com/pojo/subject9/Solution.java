/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution
 * Author:   think
 * Date:     2019/8/22 21:40
 * Description: 变态跳台阶
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject9;

/**
 * 〈一句话功能简述〉<br> 
 * 〈变态跳台阶
 * 斐波那契数列的变种〉
 *
 * @author think
 * @create 2019/8/22
 * @since 1.0.0
 */
public class Solution {
    public int JumpFloorII(int target) {
        if (target <= 0){
            throw new RuntimeException();
        }

        if (target == 1){
            return 1;
        }

        return 2 * JumpFloorII(target - 1);
    }
}
