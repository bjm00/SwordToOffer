/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Solution
 * Author:   think
 * Date:     2019/8/20 14:39
 * Description: 调整数组中数字顺序使得奇数在偶数前面
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package subject13;

/**
 * 〈一句话功能简述〉<br> 
 * 〈调整数组中数字顺序使得奇数在偶数前面
 *  方法一：冒泡排序〉
 *
 * @author think
 * @create 2019/8/20
 * @since 1.0.0
 */
public class Solution {
    public void reOrderArray(int [] array) {
        if (array.length == 0){
            return;
        }
        int temp;
        int i = 0;
        while (i < array.length){
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] % 2 == 1 && array[j - 1] % 2 == 0){
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
            i++;
        }
    }
}
