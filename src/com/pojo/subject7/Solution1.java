/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution1
 * Author:   think
 * Date:     2019/8/21 10:36
 * Description: 动态规划法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject7;

/**
 * 〈一句话功能简述〉<br> 
 * 〈动态规划法〉
 *
 * @author think
 * @create 2019/8/21
 * @since 1.0.0
 */
public class Solution1 {
    public int Fibonacci(int n) throws Exception {
        if (n < 0) {
            throw new Exception();
        }

        if(n == 0){
            return 0;
        }

        int first = 1;
        int secend = 1;

        while (--n > 1){
            secend = secend + first;
            first = secend - first;
        }

        return secend;
    }
}
