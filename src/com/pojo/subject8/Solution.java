/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution
 * Author:   think
 * Date:     2019/8/22 9:15
 * Description: 跳台阶
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject8;

/**
 * 〈动态规划解法
 *  递归解法比较常见，参考subject7的答案即可〉<br>
 * 〈跳台阶
 * 实际上还是斐波那契数列〉
 *
 * @author think
 * @create 2019/8/22
 * @since 1.0.0
 */
public class Solution {
    public int JumpFloor(int target) {
        if(target < 0){
            throw new RuntimeException();
        }

        if (target == 1){
            return 1;
        }

        if (target == 2){
            return 2;
        }
        int first = 1;
        int secend = 2;

        while (--target > 2){
            secend = secend + first;
            first = secend - first;
        }
        return secend;
    }
}
