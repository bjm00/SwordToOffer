/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Soulution
 * Author:   think
 * Date:     2019/8/5 14:17
 * Description: 剑指offer第六题
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pojo.subject6;


/**
 * 〈把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 *
 * 二分查找〉<br>
 * 〈剑指offer第六题〉
 *
 * @author think
 * @create 2019/8/5
 * @since 1.0.0
 */
public class Soulution {
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0){
            return 0;
        }

        int low = 0;
        int high = array.length - 1;

        while (low < high){
            int mid = (low + high) / 2;
            if (array[mid] > array[high]){
                low = mid + 1;
            }else if (array[mid] == array[high]){
                high--;
            }else if (array[mid] < array[high]){
                high = mid;
            }
        }

        return array[low];
    }
}
