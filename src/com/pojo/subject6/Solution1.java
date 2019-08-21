/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution1
 * Author:   think
 * Date:     2019/8/20 10:12
 * Description: 练习复习
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject6;

import org.omg.CosNaming.IstringHelper;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈任何时间不要忘记暴力求解的方式，这是下限
 * 暴力求解〉
 *
 * @author think
 * @create 2019/8/20
 * @since 1.0.0
 */
public class Solution1 {
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0){
            return 0;
        }

        int temp = array[0];
        for (int i = 0; i < array.length; i++) {
            if (temp > array[i]){
                temp = array[i];
            }
        }
        return temp;
    }
}
