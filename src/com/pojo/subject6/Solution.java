/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution
 * Author:   think
 * Date:     2019/8/20 11:25
 * Description: 练习复习
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject6;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈练习复习〉
 *
 * @author think
 * @create 2019/8/20
 * @since 1.0.0
 */
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0){
            return 0;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }

        int high = list.size() - 1;
        int bottom = 0;
        int middle = 0;

        while (bottom < high){
            middle = (high + bottom) / 2;
            if (list.get(high) > list.get(middle)){
                high = middle;
            }else if (list.get(high) == list.get(middle)){
                high = high - 1;
            }else{
                bottom = middle + 1;
            }
        }
        return list.get(bottom);
    }
}
