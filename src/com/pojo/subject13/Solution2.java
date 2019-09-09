/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution2
 * Author:   think
 * Date:     2019/8/23 10:23
 * Description: 该题跟浦发机试题一样
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject13;

/**
 * 〈插入排序的思想〉<br>
 * 〈该题跟浦发机试题一样〉
 *
 * @author think
 * @create 2019/8/23
 * @since 1.0.0
 */
public class Solution2 {
    public void reOrderArray(int [] array) {
        if (array.length == 0){
            return;
        }

        int length = array.length;
        int k = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] % 2 == 1){
                int j = i;
                while (j > k){
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    j--;
                }
                k++;
            }
        }
    }
}
