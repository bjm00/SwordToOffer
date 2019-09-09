/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution1
 * Author:   think
 * Date:     2019/8/27 15:15
 * Description: 输出二进制数中1的个数，精简版
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject11;

/**
 * 〈一句话功能简述〉<br> 
 * 〈输出二进制数中1的个数，精简版〉
 *
 * @author think
 * @create 2019/8/27
 * @since 1.0.0
 */
public class Solution1 {
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0){
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}
