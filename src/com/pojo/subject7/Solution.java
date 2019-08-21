/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution
 * Author:   think
 * Date:     2019/8/20 13:53
 * Description: 斐波那契数列--使用递归解法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject7;

/**
 * 〈一句话功能简述〉<br> 
 * 〈斐波那契数列--使用递归解法〉
 *
 * @author think
 * @create 2019/8/20
 * @since 1.0.0
 */
public class Solution {
    public int Fibonacci(int n) throws Exception {
        if (n < 0){
            throw new Exception("n不能小于零");
        }

        if(n == 0){
            return 0;
        }

        if (n == 1){
            return 1;
        }
        int res = 0;
        if (n > 1){
            res =  Fibonacci(n - 2) + Fibonacci(n - 1);
        }

        return res;
    }
}
