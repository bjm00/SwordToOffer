/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution2
 * Author:   think
 * Date:     2019/7/31 14:39
 * Description: 利用二维数组由上到下，由左到右递增的规律,使用左下角的元素a[row][col]与target进行比较
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject1;

/**
 * 〈一句话功能简述〉<br> 
 * 〈利用二维数组由上到下，由左到右递增的规律,使用左下角的元素a[row][col]与target进行比较,时间复杂度是n〉
 *
 * @author think
 * @create 2019/7/31
 * @since 1.0.0
 */
public class Solution2 {
    public boolean Find(int target, int [][] array) {
        int row = array.length - 1;
        int column = 0;
        int temp = array[row][column];
        while (row >= 0 && column < array[0].length){
            if (target > array[row][column]){
                column++;
            }else if (target < array[row][column]){
                row--;
            }else {
                return true;
            }
        }
        return false;
    }
}
