/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Test
 * Author:   think
 * Date:     2019/8/21 9:35
 * Description: 复习练习
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject12;

/**
 * 〈一句话功能简述〉<br> 
 * 〈复习练习〉
 *
 * @author think
 * @create 2019/8/21
 * @since 1.0.0
 */
public class Test {
    public double Power(double base, int n) {
        int exponent;
        double current = base,result = 1;

        if (n == 0){
            return 1;
        }else if (n > 0){
            exponent = n;
        }else{
            if(base == 0){
                throw new RuntimeException("分母不能为零！！！");
            }else{
                exponent = -n;
            }
        }

        while (exponent != 0){
            if ((exponent & 1) == 1){
                result *= current;
            }
            current *= current;
            exponent >>= 1;
        }
        return n >= 0?result:(1 / result);
    }
}
