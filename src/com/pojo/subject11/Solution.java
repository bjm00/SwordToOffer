/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution
 * Author:   think
 * Date:     2019/8/23 9:55
 * Description: 2*1矩形覆盖2*n矩形的问题
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject11;

/**
 * 〈一句话功能简述〉<br> 
 * 〈输出二进制整数中1的个数〉
 *
 * @author think
 * @create 2019/8/23
 * @since 1.0.0
 */
public class Solution {
    public int NumberOf1(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0){
            if ((n & flag) != 0){
                count++;
            }
            flag <<= 1;
        }

        return count;
    }
}
