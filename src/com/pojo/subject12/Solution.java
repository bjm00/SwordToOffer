/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution
 * Author:   think
 * Date:     2019/8/20 13:54
 * Description: 数值的整数次方
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject12;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈数值的整数次方
 *  看似简单但是要考虑的非常多
 *  全面考察指数的正负、底数是否为零等情况。
 *  写出指数的二进制表达，例如13表达为二进制1101
 *  举例:10^1101 = 10^0001*10^0100*10^1000
 *  通过&1和>>1来逐位读取1101，为1时将该位代表的乘数累乘到最终结果〉
 *
 * @author think
 * @create 2019/8/20
 * @since 1.0.0
 */
public class Solution {
    public double Power(double base, int n) {
        double res = 1;
        int exponent;
        double current = base;
        if (n == 0){
            return 1;
        }else if (n < 0){
            if (base < 0) {
                throw new RuntimeException("分母不能为零！！");
            }else{
                exponent = -n;
            }
        }else{//n>0
            exponent = n;
        }

        while (exponent != 0){
            if ((exponent & 1) == 1){
                res *=current;
            }
            current *= current;
            exponent >>=1;
        }

        return n >= 0?res:(1 / res);
    }
}
