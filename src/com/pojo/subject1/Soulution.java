/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Soulution
 * Author:   think
 * Date:     2019/7/29 17:01
 * Description: 剑指offer第一题
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject1;


/**
 * 〈暴力遍历寻找 时间复杂度n^*2〉<br>
 * 〈剑指offer第一题
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，每一列都按照
 * 从上到下递增的顺序排序。请完成一个函数，输入这样的
 * 一个二维数组和一个整数，判断数组中是否含有该整数。〉
 *
 * @author think
 * @create 2019/7/29
 * @since 1.0.0
 */
public class Soulution {
        public boolean find(int target,int [][] array){
            //Scanner scanner = new Scanner(System.in);
            if (array == null) {
                return false;
            }else{
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        if (array[i][j] == target)
                            return true;
                    }
                }
            }
            return false;
        }
}
