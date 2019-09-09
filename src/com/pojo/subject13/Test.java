/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Test
 * Author:   think
 * Date:     2019/8/27 15:35
 * Description: 练习
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject13;

/**
 * 〈一句话功能简述〉<br> 
 * 〈练习〉
 *
 * @author think
 * @create 2019/8/27
 * @since 1.0.0
 */
public class Test {
    public void reOrderArray(int [] array) {
        if (array.length == 0){
            return;
        }

        int i = 0,temp = 0;
        int length = array.length - 1;
        while (i < length){
            for (int j = length; j > i ; j--) {
                if (array[j] % 2 == 1 && array[j - 1] % 2== 0){
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
            i++;
        }
    }
}
